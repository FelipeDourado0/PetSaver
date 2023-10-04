package com.example.petsaver.repository

import com.example.petsaver.database_materia.model.MateriaDomain

interface IMateriasRepository {
    suspend fun voceSabiaList() : MutableList<MateriaDomain>
    suspend fun exploreList() : MutableList<MateriaDomain>
    suspend fun insereDadosInicias(listaMaterias: List<MateriaDomain>)
    suspend fun apagarDados()
}