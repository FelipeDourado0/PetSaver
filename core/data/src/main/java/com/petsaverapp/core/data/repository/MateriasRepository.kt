package com.petsaverapp.core.data.repository

import com.petsaverapp.core.data.database.daos.MateriaDao
import com.petsaverapp.core.data.database.model.MateriaDomain
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