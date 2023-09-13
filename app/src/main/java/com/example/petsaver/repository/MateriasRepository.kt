package com.example.petsaver.repository

import androidx.lifecycle.LiveData
import com.example.petsaver.database_materia.daos.MateriaDao
import com.example.petsaver.database_materia.model.Materia

class MateriaRepository(private val materiaDao: MateriaDao) {
    suspend fun voceSabiaList() = materiaDao.getAllVoceSabiaItems()
    suspend fun exploreList() = materiaDao.getAllExploreItems()
    suspend fun insereDadosInicias(listaMaterias: List<Materia>) {
        materiaDao.insertAll(listaMaterias)
    }
    suspend fun apagarDados() = materiaDao.deleteAllItems()
}