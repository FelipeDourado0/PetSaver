package com.petsaverapp.form.ui.fragments

import android.app.DatePickerDialog
import android.os.Bundle
import android.text.InputFilter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.text.set
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.MaterialAutoCompleteTextView

import com.petsaverapp.form.R
import com.petsaverapp.form.databinding.FragmentCadastroUsuarioBinding
import dagger.hilt.android.AndroidEntryPoint
import java.util.Calendar

@AndroidEntryPoint
class CadastroUsuarioFragment : Fragment() {
    private var _binding: FragmentCadastroUsuarioBinding? = null
    private val binding get() = _binding!!
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

        binding.cepEditTextCadastroUsuario.filters += InputFilter.LengthFilter(8)

        binding.nascimentoCadastroUsuario.setOnClickListener {
            criarCalendarioEditText(binding.nascimentoCadastroUsuario)
        }

        binding.btnSairTelaLogin.setOnClickListener {
            findNavController().navigateUp()
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
                val dat = ("$day/$monthString/$year")

                editText.setText(dat)
            }, ano, mes, dia
        )
        dataPickerDialog.show()
    }

    private fun criarAlertaErro(view: View, mensagem: String){
        Snackbar.make(view,mensagem,Snackbar.LENGTH_SHORT).setBackgroundTint(
            ContextCompat.getColor(requireContext(),R.color.red)
        ).show()
    }
}