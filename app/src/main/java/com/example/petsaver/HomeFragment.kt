package com.example.petsaver

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.petsaver.Adapters.AdapterExploreRV
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

        val recyclerView_Explore = binding.recyclerVeiwExplore
        recyclerView_Explore.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
        recyclerView_Explore.setHasFixedSize(true)

        ///AdapterConfiguring
        val adpterExplore = AdapterExploreRV(requireContext().applicationContext,ItemsCards.returnItems())
        recyclerView_Explore.adapter = adpterExplore
        return binding.root
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

}