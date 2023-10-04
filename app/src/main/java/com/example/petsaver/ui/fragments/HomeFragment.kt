package com.example.petsaver.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.commit
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.petsaver.DetailedMateriaActivity
import com.example.petsaver.MainActivity
import com.example.petsaver.R
import com.example.petsaver.database_materia.model.MateriaDomain
import com.example.petsaver.databinding.FragmentHomeBinding
import com.example.petsaver.ui.Adapters.AdapterExploreRv
import com.example.petsaver.ui.Adapters.AdapterVoceSabiaRv
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
        var ft = childFragmentManager.beginTransaction().also {
            it.replace(R.id.homeContainerView, ListaMateriasFragment())
            it.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            it.commit()
        }

    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }
}