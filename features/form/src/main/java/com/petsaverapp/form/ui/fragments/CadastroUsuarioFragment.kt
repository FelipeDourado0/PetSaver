package com.petsaverapp.form.ui.fragments

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.text.set
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

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

        binding.nascimentoCadastroUsuario.setOnClickListener {
            val calendario = Calendar.getInstance()
            val ano = calendario.get(Calendar.YEAR)
            val mes = calendario.get(Calendar.MONTH)
            val dia = calendario.get(Calendar.DAY_OF_MONTH)

            val dataPickerDialog = DatePickerDialog(
                requireContext(),
                { view, year, monthOfYear, dayOfMonth ->
                    var month = monthOfYear
                    month++
                    var day = dayOfMonth.toString()
                    if(dayOfMonth.toString().length == 1)
                        day = "0$dayOfMonth"
                    val dat = ("$day/$month/$year")

                    binding.nascimentoCadastroUsuario.setText(dat)
                }, ano, mes, dia
            )
            dataPickerDialog.show()
        }

        binding.btnSairTelaLogin.setOnClickListener {
            findNavController().navigateUp()
        }

        binding.btnProximoTelaCadastroUsuario.setOnClickListener{
            findNavController().navigate(R.id.action_cadastroUsuarioFragment_to_cadastroUsuarioSegundaTela)
        }
    }

}