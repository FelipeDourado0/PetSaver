package com.petsaverapp.petsaver.repository

import com.petsaverapp.petsaver.database_materia.daos.MateriaDao
import com.petsaverapp.petsaver.database_materia.model.MateriaDomain
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MateriaRepository @Inject constructor(
    private val materiaDao: MateriaDao
) : IMateriasRepository {
    override suspend fun voceSabiaList() = materiaDao.getAllVoceSabiaItems()
    override suspend fun exploreList() = materiaDao.getAllExploreItems()
    override suspend fun insereDadosInicias(listaMaterias: List<MateriaDomain>) {
        materiaDao.insertAll(listaMaterias)
    }

    override suspend fun apagarDados() = materiaDao.deleteAllItems()
}