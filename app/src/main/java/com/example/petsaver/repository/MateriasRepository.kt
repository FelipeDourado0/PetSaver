package com.example.petsaver.repository

import androidx.lifecycle.LiveData
import com.example.petsaver.database_materia.daos.MateriaDao
import com.example.petsaver.database_materia.model.Materia
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MateriaRepository @Inject constructor(
    private val materiaDao: MateriaDao
) : IMateriasRepository {
    override suspend fun voceSabiaList() = materiaDao.getAllVoceSabiaItems()
    override suspend fun exploreList() = materiaDao.getAllExploreItems()
    override suspend fun insereDadosInicias(listaMaterias: List<Materia>) {
        materiaDao.insertAll(listaMaterias)
    }

    override suspend fun apagarDados() = materiaDao.deleteAllItems()
}