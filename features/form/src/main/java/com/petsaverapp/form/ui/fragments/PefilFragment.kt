package com.petsaverapp.form.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.petsaverapp.form.R
import com.petsaverapp.form.databinding.FragmentBemVindoBinding
import com.petsaverapp.form.databinding.FragmentPefilBinding

class PefilFragment : Fragment() {
    private var _binding: FragmentPefilBinding? = null
    private val binding get() = _binding!!
    private val autenticacao by lazy {
        FirebaseAuth.getInstance()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPefilBinding.inflate(inflater,container,false)

        binding.iconeSairPerfil.setOnClickListener {
            autenticacao.signOut()
            findNavController().navigate(R.id.loginFragment)
        }
        binding.textoSaitPerfil.setOnClickListener {
            autenticacao.signOut()
            findNavController().navigate(R.id.loginFragment)
        }

        return binding.root
    }

}