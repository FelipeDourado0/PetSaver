package com.petsaverapp.form.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.petsaverapp.core.data.database.materiasDatabase.model.MateriaDomain
import com.petsaverapp.core.repository.materiasRepository.IMateriasRepository
import com.petsaverapp.core.usecases.materiasUseCase.IGetMateriasUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.async
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    //private val materiasRepository: IMateriasRepository
    private val obterMateriasUseCase: IGetMateriasUseCase
) : ViewModel() {
    suspend fun dadosVoceSabiLista(): MutableList<MateriaDomain>{
        val result=  viewModelScope.async { obterMateriasUseCase.obterVoceSabiaList() }
        return result.await()
    }

    suspend fun dadosExploreLista(): MutableList<MateriaDomain>{
        val result=  viewModelScope.async { obterMateriasUseCase.obterExploreList() }
        return result.await()
    }

    /*class HomeFragmentFactory(private val repository: MateriaRepository): ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return HomeViewModel(repository) as T
        }
    }*/
}

