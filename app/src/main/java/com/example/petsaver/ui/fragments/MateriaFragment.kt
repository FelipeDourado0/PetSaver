package com.example.petsaver.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.petsaver.R
import com.example.petsaver.ui.viewmodel.MateriaViewModel

class MateriaFragment : Fragment() {

    companion object {
        fun newInstance() = MateriaFragment()
    }

    private lateinit var viewModel: MateriaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_materia, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MateriaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}