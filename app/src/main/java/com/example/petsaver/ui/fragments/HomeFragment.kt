package com.example.petsaver.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.petsaver.DetailedMateriaActivity
import com.example.petsaver.MainActivity
import com.example.petsaver.database_materia.model.MateriaDomain
import com.example.petsaver.databinding.FragmentHomeBinding
import com.example.petsaver.ui.Adapters.AdapterExploreRv
import com.example.petsaver.ui.Adapters.AdapterVoceSabiaRv
import com.example.petsaver.ui.viewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HomeFragment : Fragment(), AdapterVoceSabiaRv.MateriaClickListenner {
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
        }

        /// VOCE SABIA LIST
        val recyclerViewVoceSabia = binding.recyclerVeiwVoceSabia
        recyclerViewVoceSabia.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.VERTICAL, false
        )
        recyclerViewVoceSabia.setHasFixedSize(true)
        val thisFragment = this
        var adapterVoceSabia: AdapterVoceSabiaRv
        lifecycleScope.launch {
            adapterVoceSabia = AdapterVoceSabiaRv(
                requireContext().applicationContext,
                viewModel.dadosVoceSabiLista()
            )
            recyclerViewVoceSabia.adapter = adapterVoceSabia
            adapterVoceSabia.onItemCLick = { materia ->
                Log.i("a", "click")
                val intent = Intent(requireContext(), DetailedMateriaActivity::class.java).also {
                    it.putExtra("materia", materia)
                }
                startActivity(intent)
            }
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

    override fun onMateriaClick(position: Int) {
        var list: MutableList<MateriaDomain>
        lifecycleScope.launch {
            list = viewModel.dadosVoceSabiLista()

            list[position]
            val intent = Intent(activity, PointerEventPass.Main::class.java)
            startActivity(intent)
        }
    }
}