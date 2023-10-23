package com.example.petsaver.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.petsaver.R
import com.example.petsaver.databinding.FragmentHomeBinding
import com.example.petsaver.ui.Adapters.AdapterExploreRv
import com.example.petsaver.ui.Adapters.AdapterVoceSabiaRv
import com.example.petsaver.ui.dataEntities.Materia
import com.example.petsaver.ui.viewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: HomeViewModel

    /*private val viewModel: HomeViewModel by viewModels {
        HomeViewModel.HomeFragmentFactory((requireActivity().application as MateriasApplication).materiasRepositoryApp)
    }*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[HomeViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        ///Configuring list
        ///EXPLORE LIST
        val recyclerViewExplore = binding.recyclerVeiwExplore

        recyclerViewExplore.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewExplore.setHasFixedSize(true)

        lifecycleScope.launch {
            val adpterExplore =
                AdapterExploreRv(requireContext().applicationContext, viewModel.dadosExploreLista())
            recyclerViewExplore.adapter = adpterExplore
            adpterExplore.onItemCLick =
                { materia -> enviarDadosMateriaParaMateriaFragment(materia) }
        }

        /// VOCE SABIA LIST
        val recyclerViewVoceSabia = binding.recyclerVeiwVoceSabia
        recyclerViewVoceSabia.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.VERTICAL, false
        )
        recyclerViewVoceSabia.setHasFixedSize(true)

        var adapterVoceSabia: AdapterVoceSabiaRv
        lifecycleScope.launch {
            adapterVoceSabia = AdapterVoceSabiaRv(
                requireContext().applicationContext,
                viewModel.dadosVoceSabiLista()
            )
            recyclerViewVoceSabia.adapter = adapterVoceSabia
            adapterVoceSabia.onItemCLick =
                { materia -> enviarDadosMateriaParaMateriaFragment(materia) }
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.imgLogo.setOnClickListener {
            findNavController().navigate(com.example.petsaver.R.id.action_home2_to_bemVindoFragment)
        }
        binding.tituloHome.setOnClickListener {
            findNavController().navigate(com.example.petsaver.R.id.action_home2_to_bemVindoFragment)
        }
    }

    private fun enviarDadosMateriaParaMateriaFragment(materia: Materia) {
        val action = HomeFragmentDirections.actionHomeToMateriaDetalheFragment(materia)
        findNavController().navigate(action)
    }
}