package com.petsaverapp.firebase

import com.petsaverapp.firebase.auth.Autenticacao
import com.petsaverapp.firebase.auth.IAutenticacao
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class FirebaseModule {

    @Singleton
    @Binds
    abstract fun providesFirebaseAuth(implementation: Autenticacao): IAutenticacao
}