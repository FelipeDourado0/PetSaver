package com.petsaverapp.form.ui.fragments

import android.os.Build
import android.os.Bundle
import android.transition.TransitionInflater
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.navigation.findNavController
import com.petsaverapp.form.R
import com.petsaverapp.form.databinding.FragmentBemVindoBinding

import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BemVindoFragment : Fragment() {
    private var _binding : FragmentBemVindoBinding? = null
    private val binding get() = _binding!!

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val inflater = TransitionInflater.from(requireContext())
        exitTransition = inflater.inflateTransition(R.transition.slide_right)
    }
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