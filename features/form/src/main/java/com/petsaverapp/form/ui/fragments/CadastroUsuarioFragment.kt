package com.petsaverapp.form.ui.fragments

import android.app.DatePickerDialog
import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.InputFilter
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getSystemService
import androidx.core.text.set
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.MaterialAutoCompleteTextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.petsaverapp.core.api.interfaces.EnderecoAPI
import com.petsaverapp.core.api.model.Endereco

import com.petsaverapp.form.R
import com.petsaverapp.form.databinding.FragmentCadastroUsuarioBinding
import com.petsaverapp.form.ui.dataEntities.Usuario
import com.petsaverapp.form.ui.viewmodel.CadastroUsuarioViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import java.lang.Exception
import java.util.Calendar
import javax.inject.Inject

@AndroidEntryPoint
class CadastroUsuarioFragment : Fragment() {
    private var _binding: FragmentCadastroUsuarioBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: CadastroUsuarioViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[CadastroUsuarioViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCadastroUsuarioBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        retiraErro()
        //Observer dados vindos da API
        viewModel.observaEndereco.observe(viewLifecycleOwner) {
            binding.enderecoEditTextCadastroUsuario.setText(it.endereco)
            binding.estadoDropdownCadastroUsuario.setText(it.uf)
        }

        //Filtrando quantidade maxima de numeros
        binding.cepEditTextCadastroUsuario.filters += InputFilter.LengthFilter(8)
        binding.cpfEditTextCadastroUsuario.filters += InputFilter.LengthFilter(11)

        //Criando calendario para data nascimento
        binding.nascimentoCadastroUsuario.setOnClickListener {
            criarCalendarioEditText(binding.nascimentoCadastroUsuario)
        }

        //Botao sair da tela
        binding.btnSairTelaLogin.setOnClickListener {
            findNavController().navigateUp()
        }

        //Listenner do CEP para chamada da API do busca CEP
        binding.cepEditTextCadastroUsuario.addTextChangedListener {
            val currentText = it?.toString() ?: ""
            val currentEstadoDropDown = binding.estadoDropdownCadastroUsuario.text.toString()
            if (currentText.length == 8) {
                hideKeyboard()
                CoroutineScope(Dispatchers.IO).launch {
                    Log.i("Info_endereco", "entrou")
                    recuperarEndereco(binding.cepEditTextCadastroUsuario.text.toString())
                }
            } else if (currentText.length < 8 && currentEstadoDropDown != "") {
                binding.estadoDropdownCadastroUsuario.setText("")
            }
        }

        //Botao para cadastrar dados do usuario
        binding.btnProximoTelaCadastroUsuario.setOnClickListener {
            if (validaCampos()) {
                criarAlertaErro(it, "Preencha corretamente o formulário!")
            } else {
                val usuario = Usuario(
                    nome = binding.nomeEditTextCadastroUsuario.text.toString(),
                    dataNascimento = binding.nascimentoCadastroUsuario.text.toString(),
                    cpf = binding.cpfEditTextCadastroUsuario.text.toString(),
                    cep = binding.cepEditTextCadastroUsuario.text.toString(),
                    endereco = binding.enderecoEditTextCadastroUsuario.text.toString(),
                    numeroEndereco = binding.numeroEditTextCadastroUsuario.text.toString(),
                    estado = binding.estadoDropdownCadastroUsuario.text.toString(),
                    complemento = binding.complementoEditTextCadastroUsuario.text.toString(),
                    email = "",
                    senha = "",
                    concordouEmReceberNovidades = false,
                    concordouEmReceberNotificacoesSobreVacinacao = false
                )

                val action = CadastroUsuarioFragmentDirections
                    .actionCadastroUsuarioFragmentToCadastroUsuarioSegundaTela(usuario)

                findNavController().navigate(action)
            }
        }


    }

    private fun validaCampos(): Boolean {
        var error: Boolean = false
        if (binding.nomeEditTextCadastroUsuario.text!!.isEmpty()) {
            binding.nomeLayoutCadastroUsuario.error = "Digite seu nome!"
            error = true
        }

        if (binding.cpfEditTextCadastroUsuario.text!!.isEmpty()) {
            binding.cpfLayoutCadastroUsuario.error = "Digite seu CPF!"
            error = true
        } else if (!validaCPF(binding.cpfEditTextCadastroUsuario.text.toString())) {
            binding.cpfLayoutCadastroUsuario.error = "CPF inválido"
            error = true
        }

        if (binding.nascimentoCadastroUsuario.text!!.isEmpty()) {
            binding.nascimentoLayoutCadastroUsuario.error = "Digite sua data de nascimento!"
            error = true
        }

        if (binding.cepEditTextCadastroUsuario.text!!.isEmpty()
            || binding.cepEditTextCadastroUsuario.text.toString().length < 8
        ) {
            binding.cepLayoutCadastroUsuario.error = "Digite um CEP válido!"
            error = true
        }

        if (binding.enderecoEditTextCadastroUsuario.text!!.isEmpty()) {
            binding.enderecoLayoutCadastroUsuario.error = "Coloque um endereço!"
            error = true
        }

        if (binding.numeroEditTextCadastroUsuario.text!!.isEmpty()) {
            binding.numeroLayoutCadastroUsuario.error = "Digite um número!"
            error = true
        }

        if (binding.estadoDropdownCadastroUsuario.text!!.isEmpty()) {
            binding.estadoLayoutCadastroUsuario.error = "Escolha um estado!"
            error = true
        }

        return error
    }

    private fun retiraErro() {
        binding.nomeEditTextCadastroUsuario.addTextChangedListener {
            binding.nomeLayoutCadastroUsuario.error = null
        }

        binding.cpfEditTextCadastroUsuario.addTextChangedListener {
            binding.cpfLayoutCadastroUsuario.error = null
        }

        binding.nascimentoCadastroUsuario.addTextChangedListener {
            binding.nascimentoLayoutCadastroUsuario.error = null
        }

        binding.cepEditTextCadastroUsuario.addTextChangedListener {
            binding.cepLayoutCadastroUsuario.error = null
        }

        binding.enderecoEditTextCadastroUsuario.addTextChangedListener {
            binding.enderecoLayoutCadastroUsuario.error = null
        }

        binding.numeroEditTextCadastroUsuario.addTextChangedListener {
            binding.numeroLayoutCadastroUsuario.error = null
        }

        binding.estadoDropdownCadastroUsuario.addTextChangedListener {
            binding.estadoLayoutCadastroUsuario.error = null
        }
    }

    private fun criarCalendarioEditText(editText: EditText) {
        val calendario = Calendar.getInstance()
        val ano = calendario.get(Calendar.YEAR)
        val mes = calendario.get(Calendar.MONTH)
        val dia = calendario.get(Calendar.DAY_OF_MONTH)

        val dataPickerDialog = DatePickerDialog(
            requireContext(),
            { view, year, monthOfYear, dayOfMonth ->
                var monthInt = monthOfYear
                monthInt++
                var monthString = monthInt.toString()
                if (monthString.length == 1)
                    monthString = "0$monthString"
                var day = dayOfMonth.toString()
                if (dayOfMonth.toString().length == 1)
                    day = "0$dayOfMonth"
                val dataCompleta = ("$day/$monthString/$year")

                editText.setText(dataCompleta)
            }, ano, mes, dia
        )
        dataPickerDialog.show()
    }

    private fun criarAlertaErro(view: View, mensagem: String) {
        Snackbar.make(view, mensagem, Snackbar.LENGTH_SHORT).setBackgroundTint(
            ContextCompat.getColor(requireContext(), R.color.red)
        ).show()
    }

    private suspend fun recuperarEndereco(cep: String) {
        try {
            viewModel.recuperarDadosEndereco(cep)
        } catch (e: Exception) {
            e.printStackTrace()
            Log.i("Info_endereco", "Erro ao recuperar endereco")
        }
    }

    fun Fragment.hideKeyboard() {
        val view = activity?.currentFocus
        if (view != null) {
            val imm = activity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
            view.clearFocus()
        }
    }

    // Função que valida o CPF
    private fun validaCPF(cpf: String): Boolean {
        // Remove caracteres não numéricos
        val onlyNumbers = cpf.replace("\\D".toRegex(), "")

        // Verifica se o CPF possui 11 dígitos
        if (onlyNumbers.length != 11) {
            return false
        }

        // Verifica se todos os dígitos são iguais
        if (onlyNumbers.toSet().size == 1) {
            return false
        }

        // Calcula o primeiro dígito verificador
        var sum = 0
        for (i in 0 until 9) {
            sum += onlyNumbers[i].toString().toInt() * (10 - i)
        }
        var remainder = sum % 11
        val digit1 = if (remainder < 2) 0 else 11 - remainder

        // Calcula o segundo dígito verificador
        sum = 0
        for (i in 0 until 10) {
            sum += onlyNumbers[i].toString().toInt() * (11 - i)
        }
        remainder = sum % 11
        val digit2 = if (remainder < 2) 0 else 11 - remainder

        // Verifica se os dígitos verificadores são iguais aos fornecidos no CPF
        return onlyNumbers.endsWith("$digit1$digit2")
    }

}