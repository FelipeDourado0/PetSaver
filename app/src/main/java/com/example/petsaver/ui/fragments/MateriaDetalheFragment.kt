package com.example.petsaver.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.petsaver.R
import com.example.petsaver.databinding.FragmentListaMateriasBinding
import com.example.petsaver.databinding.FragmentMateriaDetalheBinding
import com.example.petsaver.ui.viewmodel.MateriaDetalheViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MateriaDetalheFragment : Fragment() {
    private var _binding: FragmentMateriaDetalheBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: MateriaDetalheViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[MateriaDetalheViewModel::class.java]

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }
}