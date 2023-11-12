package com.petsaverapp.core.usecases.materiasUseCase

import com.petsaverapp.core.data.database.materiasDatabase.model.MateriaDomain
import com.petsaverapp.core.repository.materiasRepository.IMateriasRepository
import javax.inject.Inject


class GetMateriasUseCase @Inject constructor(
    private val materiasRepository: IMateriasRepository
) : IGetMateriasUseCase{
    override suspend fun obterVoceSabiaList(): MutableList<MateriaDomain> =  materiasRepository.exploreList()

    override suspend fun obterExploreList(): MutableList<MateriaDomain> = materiasRepository.voceSabiaList()
}