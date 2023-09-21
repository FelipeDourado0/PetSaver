package com.example.petsaver.repository

import com.example.petsaver.database_materia.model.Materia

interface IMateriasRepository {
    suspend fun voceSabiaList() : MutableList<Materia>
    suspend fun exploreList() : MutableList<Materia>
    suspend fun insereDadosInicias(listaMaterias: List<Materia>)
    suspend fun apagarDados()
}