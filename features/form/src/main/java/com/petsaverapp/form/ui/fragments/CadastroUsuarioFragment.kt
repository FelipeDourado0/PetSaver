package com.petsaverapp.form.ui.fragments

import android.app.DatePickerDialog
import android.content.Context
import android.os.Bundle
import android.text.InputFilter
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
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.MaterialAutoCompleteTextView
import com.petsaverapp.core.api.interfaces.EnderecoAPI
import com.petsaverapp.core.api.model.Endereco

import com.petsaverapp.form.R
import com.petsaverapp.form.databinding.FragmentCadastroUsuarioBinding
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

        viewModel.observaEndereco.observe(viewLifecycleOwner){
            binding.enderecoEditTextCadastroUsuario.setText(it.endereco)
            binding.estadoDropdownCadastroUsuario.setText(it.uf)
        }

        binding.cepEditTextCadastroUsuario.filters += InputFilter.LengthFilter(8)

        binding.nascimentoCadastroUsuario.setOnClickListener {
            criarCalendarioEditText(binding.nascimentoCadastroUsuario)
        }

        binding.btnSairTelaLogin.setOnClickListener {
            findNavController().navigateUp()
        }

        binding.cepEditTextCadastroUsuario.setOnHoverListener { v, event ->
            Log.i("info_HoverListener", "Entrou Hover")
            if (event.action == MotionEvent.ACTION_OUTSIDE) {
                // Se sim, executar o script desejado
                Log.i("info_HoverListener", "DEU BOM")
            }else{
                Log.i("infoR", "DEU BOM 2")
            }
            false
        }

        binding.btnProximoTelaCadastroUsuario.setOnClickListener{
            if(binding.nomeEditTextCadastroUsuario.text!!.isEmpty()){
                criarAlertaErro(it,"Coloque um nome de usuário")
                //binding.nomeEditTextCadastroUsuario.error = "Com erro"
                binding.nomeLayoutCadastroUsuario.error = "Digite seu nome!"


            }else{
                findNavController().navigate(R.id.action_cadastroUsuarioFragment_to_cadastroUsuarioSegundaTela)
            }
        }

        binding.cepEditTextCadastroUsuario.addTextChangedListener {
            val currentText = it?.toString() ?: ""
            if(currentText.length == 8) {
                hideKeyboard()
                CoroutineScope(Dispatchers.IO).launch {
                    Log.i("Info_endereco", "entrou")
                    recuperarEndereco(binding.cepEditTextCadastroUsuario.text.toString())
                }
            }
        }
    }

    private fun criarCalendarioEditText(editText: EditText){
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
                if(monthString.length == 1)
                    monthString = "0$monthString"
                var day = dayOfMonth.toString()
                if(dayOfMonth.toString().length == 1)
                    day = "0$dayOfMonth"
                val dataCompleta = ("$day/$monthString/$year")

                editText.setText(dataCompleta)
            }, ano, mes, dia
        )
        dataPickerDialog.show()
    }

    private fun criarAlertaErro(view: View, mensagem: String){
        Snackbar.make(view,mensagem,Snackbar.LENGTH_SHORT).setBackgroundTint(
            ContextCompat.getColor(requireContext(),R.color.red)
        ).show()
    }

    private suspend fun recuperarEndereco(cep: String){
        try {
            viewModel.recuperarDadosEndereco(cep)
        }catch (e: Exception){
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
}