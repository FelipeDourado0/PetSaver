package com.petsaverapp.core.data.di

import android.app.Application
import com.petsaverapp.core.data.database.MateriasDatabase
import com.petsaverapp.core.data.database.daos.MateriaDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object materiasRoomModule {
    @Singleton
    @Provides
    fun providesMateriasDatabase(application: Application): MateriasDatabase {
        return  MateriasDatabase.getDatabase(application)
    }

    @Singleton
    @Provides
    fun providesMateriaDao(database: MateriasDatabase): MateriaDao {
        return database.materiaDAO()
    }


}