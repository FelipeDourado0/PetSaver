package com.example.petsaver.ui.viewmodel

import android.app.Application
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.petsaver.database_materia.MateriasDatabase
import com.example.petsaver.database_materia.daos.MateriaDao
import com.example.petsaver.database_materia.model.Materia
import com.example.petsaver.repository.IMateriasRepository
import com.example.petsaver.repository.MateriaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val materiasRepository: IMateriasRepository
) : ViewModel() {
    lateinit var materiaExploreList: MutableList<Materia>
    lateinit var materiaVoceSabiaList: MutableList<Materia>

    suspend fun dadosVoceSabiLista(): MutableList<Materia>{
        var result=  viewModelScope.async { materiasRepository.voceSabiaList() }
        return result.await()
    }

    suspend fun dadosExploreLista(): MutableList<Materia>{
        var result=  viewModelScope.async { materiasRepository.exploreList() }
        return result.await()
    }

    /*class HomeFragmentFactory(private val repository: MateriaRepository): ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return HomeViewModel(repository) as T
        }
    }*/
}

