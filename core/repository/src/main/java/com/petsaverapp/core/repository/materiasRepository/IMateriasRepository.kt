package com.petsaverapp.core.repository.materiasRepository

import com.petsaverapp.core.data.database.model.MateriaDomain


interface IMateriasRepository {
    suspend fun voceSabiaList() : MutableList<MateriaDomain>
    suspend fun exploreList() : MutableList<MateriaDomain>
    suspend fun insereDadosInicias(listaMaterias: List<MateriaDomain>)
    suspend fun apagarDados()
}