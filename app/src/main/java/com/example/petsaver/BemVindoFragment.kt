package com.example.petsaver

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.petsaver.databinding.FragmentBemVindoBinding

class BemVindoFragment : Fragment() {
    private var _binding : FragmentBemVindoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBemVindoBinding.inflate(inflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonBemVindoHome.setOnClickListener {
            binding.buttonBemVindoHome.findNavController().navigate(R.id.action_bemVindoFragment_to_home2)
        }

    }
}