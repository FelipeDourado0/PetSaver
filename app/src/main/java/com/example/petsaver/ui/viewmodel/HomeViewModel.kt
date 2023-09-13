package com.example.petsaver.ui.viewmodel

import android.app.Application
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.petsaver.database_materia.MateriasDatabase
import com.example.petsaver.database_materia.daos.MateriaDao
import com.example.petsaver.database_materia.model.Materia
import com.example.petsaver.repository.MateriaRepository
import kotlinx.coroutines.coroutineScope

class HomeViewModel(private val materiasRepository: MateriaRepository): ViewModel() {

    suspend fun obterListaExplore() = materiasRepository.exploreList()
    suspend fun obterListaVoceSabia() = materiasRepository.exploreList()

    class HomeFragmentFactory(private val repository: MateriaRepository): ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return HomeViewModel(repository) as T
        }
    }

    /*private suspend fun getBitmap(): Bitmap {
        val loading = ImageLoader(requireContext())
        val request = ImageRequest.Builder(requireContext())
            .data("https://www.goethe.de/prj/dlp/assets/images/default.png")
            .build()
        val result = (loading.execute(request) as SuccessResult).drawable

        return (result as BitmapDrawable).bitmap
    }*/
}

