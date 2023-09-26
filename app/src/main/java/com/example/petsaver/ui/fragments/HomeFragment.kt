package com.example.petsaver.ui.Adapters.fragments

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
import com.example.petsaver.ui.Adapters.AdapterExploreRv
import com.example.petsaver.ui.Adapters.AdapterVoceSabiaRv
import com.example.petsaver.databinding.FragmentHomeBinding
import com.example.petsaver.ui.viewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.async
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
        _binding = FragmentHomeBinding.inflate(inflater,container,false)
        /*lifecycleScope.launch{
            try {
                viewModel.initialMateriasDatabase()
            }catch(e: Exception){
                Log.e("Error", "erro no banco", )
            }
        }*/
        ///Configuring list
        ///EXPLORE LIST
        var recyclerView_Explore = binding.recyclerVeiwExplore

        recyclerView_Explore.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
        recyclerView_Explore.setHasFixedSize(true)

        lifecycleScope.launch {
            val adpterExplore = AdapterExploreRv(requireContext().applicationContext, viewModel.dadosExploreLista())
            recyclerView_Explore.adapter = adpterExplore
        }

        /// VOCE SABIA LIST
        val recyclerView_VoceSabia = binding.recyclerVeiwVoceSabia
        recyclerView_VoceSabia.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        recyclerView_VoceSabia.setHasFixedSize(true)

        var adapterVoceSabia : AdapterVoceSabiaRv
        lifecycleScope.launch {
            adapterVoceSabia = AdapterVoceSabiaRv(requireContext().applicationContext, viewModel.dadosVoceSabiLista())
            recyclerView_VoceSabia.adapter = adapterVoceSabia
            adapterVoceSabia.onItemClick = {
                Log.i("entrou", "entou")
                findNavController().navigate(R.id.materiaFragment)
            }
        }



        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.imgLogo.setOnClickListener {
            findNavController().navigate(R.id.action_home2_to_bemVindoFragment)
        }
        binding.tituloHome.setOnClickListener{
            findNavController().navigate(R.id.action_home2_to_bemVindoFragment)
        }


    }



}