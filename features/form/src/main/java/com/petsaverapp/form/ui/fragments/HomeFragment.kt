package com.petsaverapp.form.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.petsaverapp.form.R
import com.petsaverapp.form.databinding.FragmentHomeBinding
import com.petsaverapp.form.ui.adapters.AdapterExploreRv
import com.petsaverapp.form.ui.adapters.AdapterVoceSabiaRv
import com.petsaverapp.form.ui.dataEntities.Materia
import com.petsaverapp.form.ui.viewmodel.HomeViewModel
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
            findNavController().navigate(R.id.action_home2_to_bemVindoFragment)
        }
        binding.tituloHome.setOnClickListener {
            findNavController().navigate(R.id.action_home2_to_bemVindoFragment)
        }
    }

    private fun enviarDadosMateriaParaMateriaFragment(materia: Materia) {
        val action = com.petsaverapp.form.ui.fragments.HomeFragmentDirections.actionHomeToMateriaDetalheFragment(materia)
        findNavController().navigate(action)
    }
}