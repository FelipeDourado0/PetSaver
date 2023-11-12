package com.petsaverapp.core.usecases

import com.petsaverapp.core.usecases.materiasUseCase.GetMateriasUseCase
import com.petsaverapp.core.usecases.materiasUseCase.IGetMateriasUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class CollectionsModule {

    @Singleton
    @Binds
    abstract fun providesGetMateriasUseCase(impl: GetMateriasUseCase):IGetMateriasUseCase
}