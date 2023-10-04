package com.example.petsaver.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.petsaver.database_materia.model.MateriaDomain
import com.example.petsaver.repository.IMateriasRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.async
import javax.inject.Inject

@HiltViewModel
class ListaMateriasViewModel @Inject constructor(
    private val materiasRepository: IMateriasRepository
) : ViewModel() {
    lateinit var materiaExploreList: MutableList<MateriaDomain>
    lateinit var materiaVoceSabiaList: MutableList<MateriaDomain>

    suspend fun dadosVoceSabiLista(): MutableList<MateriaDomain> {
        var result = viewModelScope.async { materiasRepository.voceSabiaList() }
        return result.await()
    }

    suspend fun dadosExploreLista(): MutableList<MateriaDomain> {
        var result = viewModelScope.async { materiasRepository.exploreList() }
        return result.await()
    }
}