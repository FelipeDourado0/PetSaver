package com.petsaverapp.core.usecases.materiasUseCase

import com.petsaverapp.core.data.database.materiasDatabase.model.MateriaDomain

interface IGetMateriasUseCase {
    suspend fun obterVoceSabiaList() : MutableList<MateriaDomain>
    suspend fun obterExploreList() : MutableList<MateriaDomain>
}