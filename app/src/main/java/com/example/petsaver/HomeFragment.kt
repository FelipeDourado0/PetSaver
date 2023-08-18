package com.example.petsaver

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.petsaver.Adapters.AdapterExploreRv
import com.example.petsaver.Adapters.AdapterVoceSabiaRv
import com.example.petsaver.databinding.FragmentHomeBinding
import com.example.petsaver.model.ItemsCards

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater,container,false)

        ///Configuring list
        ///EXPLORE LIST
        val recyclerView_Explore = binding.recyclerVeiwExplore
        recyclerView_Explore.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
        recyclerView_Explore.setHasFixedSize(true)

        val adpterExplore = AdapterExploreRv(requireContext().applicationContext,ItemsCards.returnItems())
        recyclerView_Explore.adapter = adpterExplore

        /// VOCE SABIA LIST
        val recyclerView_VoceSabia = binding.recyclerVeiwVoceSabia
        recyclerView_VoceSabia.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        recyclerView_VoceSabia.setHasFixedSize(true)

        val adapterVoceSabia = AdapterVoceSabiaRv(requireContext().applicationContext,ItemsCards.returnItems())
        recyclerView_VoceSabia.adapter = adapterVoceSabia

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