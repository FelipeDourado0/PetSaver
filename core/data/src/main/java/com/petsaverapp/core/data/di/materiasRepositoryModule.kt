package com.petsaverapp.core.data.di

import com.petsaverapp.core.data.repository.IMateriasRepository
import com.petsaverapp.core.data.repository.MateriaRepository
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