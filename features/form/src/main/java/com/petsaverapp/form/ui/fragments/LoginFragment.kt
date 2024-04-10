package com.petsaverapp.form.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.petsaverapp.firebase.auth.IAutenticacao
import com.petsaverapp.form.R
import com.petsaverapp.form.databinding.FragmentLoginBinding
import com.petsaverapp.form.ui.viewmodel.CadastroUsuarioViewModel
import com.petsaverapp.form.ui.viewmodel.LoginViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.coroutineScope
import javax.inject.Inject
import kotlin.coroutines.coroutineContext

@AndroidEntryPoint
class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: LoginViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[LoginViewModel::class.java]
    }

    override fun onStart() {
        super.onStart()
        if (viewModel.usuarioAutenticado())
            findNavController().navigate(R.id.action_loginFragment_to_pefilFragment)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSairTelaLogin.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_bemVindoFragment)
        }

        binding.btnCadastreseTelaLogin.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_cadastroUsuarioFragment)
        }

        binding.btnEntrarTelaLogin.setOnClickListener {
            val email = binding.editTextLoginEmail.text?.toString()?:""
            val senha = binding.editeTextLoginSenha.text?.toString()?:""

            viewModel.efetuarLogin(email,senha).observe(viewLifecycleOwner){
                if(!it.loginEfetuado)
                    exibirMensagem(it.mensagemErro)
                else
                    findNavController().navigate(R.id.action_loginFragment_to_pefilFragment)
            }
        }
    }

    private fun exibirMensagem(mensagem: String) {
        Toast.makeText(requireContext(), mensagem, Toast.LENGTH_SHORT).show()
    }
}