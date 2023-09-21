package com.example.petsaver.di

import com.example.petsaver.database_materia.MateriasDatabase
import com.example.petsaver.repository.IMateriasRepository
import com.example.petsaver.repository.MateriaRepository
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