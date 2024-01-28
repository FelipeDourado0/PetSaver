package com.petsaverapp.core.api

import com.petsaverapp.core.api.interfaces.EnderecoAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {
        @Singleton
        @Provides
        fun providesRetrofit() = Retrofit.Builder()
            .baseUrl("https://viacep.com.br/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        @Singleton
        @Provides
        fun providesEnderecoApiService(retrofit: Retrofit): EnderecoAPI = retrofit.create(EnderecoAPI::class.java)


}