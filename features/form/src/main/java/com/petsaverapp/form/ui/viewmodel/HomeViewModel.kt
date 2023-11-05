package com.petsaverapp.form.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.petsaverapp.core.data.database.model.MateriaDomain
import com.petsaverapp.core.data.repository.IMateriasRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.async
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val materiasRepository: IMateriasRepository
) : ViewModel() {
    lateinit var materiaExploreList: MutableList<MateriaDomain>
    lateinit var materiaVoceSabiaList: MutableList<MateriaDomain>

    suspend fun dadosVoceSabiLista(): MutableList<MateriaDomain>{
        var result=  viewModelScope.async { materiasRepository.voceSabiaList() }
        return result.await()
    }

    suspend fun dadosExploreLista(): MutableList<MateriaDomain>{
        var result=  viewModelScope.async { materiasRepository.exploreList() }
        return result.await()
    }

    /*class HomeFragmentFactory(private val repository: MateriaRepository): ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return HomeViewModel(repository) as T
        }
    }*/
}

