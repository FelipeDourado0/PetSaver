package com.petsaverapp.petsaver.repository

import com.petsaverapp.petsaver.database_materia.model.MateriaDomain

interface IMateriasRepository {
    suspend fun voceSabiaList() : MutableList<MateriaDomain>
    suspend fun exploreList() : MutableList<MateriaDomain>
    suspend fun insereDadosInicias(listaMaterias: List<MateriaDomain>)
    suspend fun apagarDados()
}