package com.petsaverapp.form.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.petsaverapp.form.R
import com.petsaverapp.form.databinding.FragmentMateriaDetalheBinding
import com.petsaverapp.form.ui.viewmodel.MateriaDetalheViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MateriaDetalheFragment : Fragment() {
    private var _binding: FragmentMateriaDetalheBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: MateriaDetalheViewModel
    private val args: MateriaDetalheFragmentArgs by navArgs()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[MateriaDetalheViewModel::class.java]
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMateriaDetalheBinding.inflate(layoutInflater,container,false)
        binding.btnVoltarMateriaTela.setOnClickListener {
            findNavController().navigateUp()
        }
        binding.dataMateria.text = ""
        binding.temaMateria.text = args.materia?.tema
        binding.tituloMateria.text = args.materia?.title
        Glide.with(requireContext()).load(args.materia?.imagePerfilUrl).into(binding.imgAuthorMateria)
        Glide.with(requireContext()).load(args.materia?.imageBackGroundUrl).into(binding.imgPrincipalMateria)
        binding.textoPrincipal.text = args.materia?.mainText
        return binding.root
    }
}