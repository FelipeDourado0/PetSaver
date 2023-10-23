package com.petsaverapp.petsaver.di

import com.petsaverapp.petsaver.database_materia.MateriasDatabase
import com.petsaverapp.petsaver.repository.IMateriasRepository
import com.petsaverapp.petsaver.repository.MateriaRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
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