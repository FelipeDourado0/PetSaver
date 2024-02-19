package com.petsaverapp.form.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.petsaverapp.form.R
import com.petsaverapp.form.databinding.FragmentLoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    private val autenticacao by lazy {
        FirebaseAuth.getInstance()
    }

    override fun onStart() {
        super.onStart()
        if(autenticacao.currentUser != null)
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
            findNavController().navigateUp()
        }

        binding.btnCadastreseTelaLogin.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_cadastroUsuarioFragment)
        }

        binding.btnEntrarTelaLogin.setOnClickListener {
            val email = binding.editTextLoginEmail.text?.toString()
            val senha = binding.editeTextLoginSenha.text?.toString()
            if(!(email.isNullOrEmpty() || senha.isNullOrEmpty())){
                autenticacao.signInWithEmailAndPassword(email, senha)
                    .addOnSuccessListener {
                        findNavController().navigate(R.id.action_loginFragment_to_pefilFragment)
                    }
                    .addOnFailureListener {
                        exibirMensagem("Email ou senha incorretos!")
                    }
            }else{
                exibirMensagem("Email ou senha incorretos!")
            }

        }
    }
    private fun exibirMensagem(mensagem: String) {
        Toast.makeText(requireContext(), mensagem, Toast.LENGTH_SHORT).show()
    }
}