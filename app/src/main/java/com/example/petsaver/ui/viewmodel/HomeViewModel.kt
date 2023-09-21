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
import com.example.petsaver.repository.IMateriasRepository
import com.example.petsaver.repository.MateriaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.coroutineScope
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val materiasRepository: IMateriasRepository
) : ViewModel() {

    suspend fun obterListaExplore() = materiasRepository.exploreList()
    suspend fun obterListaVoceSabia() = materiasRepository.exploreList()

    suspend fun initialMateriasDatabase() {
        materiasRepository.apagarDados()

        ///Add materias
        val materiasList = listOf(
            Materia(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "aaaaaaaaaaaaa",
                title = "bbbbbbbbbbbbbbbbb",
                subTitle = "ccccccccccccccccccccccccc",
                mainText = " adasd das das dasd as asd as das ",
                voceSabiaList = true,
                exploreList = true
            ),
            Materia(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            )
        )

        materiasRepository.insereDadosInicias(materiasList)
    }
    /*class HomeFragmentFactory(private val repository: MateriaRepository): ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return HomeViewModel(repository) as T
        }
    }*/
}

