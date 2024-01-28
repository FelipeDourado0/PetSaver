package com.petsaverapp.core.repository

import com.petsaverapp.core.repository.apiRepository.EnderecoApiRepository
import com.petsaverapp.core.repository.apiRepository.IEnderecoApiRepository
import com.petsaverapp.core.repository.materiasRepository.IMateriasRepository
import com.petsaverapp.core.repository.materiasRepository.MateriaRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun providesMateriasRepository(implementation: MateriaRepository): IMateriasRepository

    @Singleton
    @Binds
    abstract fun providesEnderecoApiRepository(implementation: EnderecoApiRepository): IEnderecoApiRepository
}