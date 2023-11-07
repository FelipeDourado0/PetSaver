package com.petsaverapp.core.repository.di.materiasRepository

import com.petsaverapp.core.repository.materiasRepository.IMateriasRepository
import com.petsaverapp.core.repository.materiasRepository.MateriaRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class MateriasRepositoryModule {

    @Singleton
    @Binds
    abstract fun providesMateriasRepository(implementation: MateriaRepository): IMateriasRepository
}