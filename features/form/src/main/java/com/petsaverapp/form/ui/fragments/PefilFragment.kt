package com.petsaverapp.form.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.petsaverapp.form.R
import com.petsaverapp.form.databinding.FragmentBemVindoBinding
import com.petsaverapp.form.databinding.FragmentPefilBinding

class PefilFragment : Fragment() {
    private var _binding: FragmentPefilBinding? = null
    private val binding get() = _binding!!
    private val autenticacao by lazy {
        FirebaseAuth.getInstance()
    }

    private val fireBaseBanco by lazy {
        FirebaseFirestore.getInstance()
    }

    override fun onStart() {
        super.onStart()
        if(autenticacao.currentUser == null)
            findNavController().navigate(R.id.loginFragment)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPefilBinding.inflate(inflater,container,false)

        binding.btnLogoutPerfil.setOnClickListener {
            autenticacao.signOut()
            findNavController().navigate(R.id.loginFragment)
        }
        binding.btnVoltarPerfil.setOnClickListener {
            findNavController().navigate(R.id.action_pefilFragment_to_bemVindoFragment)
        }

        var dadosPessoaisUsuario = fireBaseBanco
            .collection("Usuarios")
            .document(autenticacao.uid!!)

        //Utilizado para atualizar os dados em tempo real
        dadosPessoaisUsuario.addSnapshotListener { value, error ->
            val dados = value?.data
            if(dados != null){
                binding.nomeUsuarioPerfil.text = dados?.get("nome").toString()
                binding.cidadeUsuarioPerfil.text = dados?.get("localidade").toString()
            }

        }
        return binding.root
    }

}