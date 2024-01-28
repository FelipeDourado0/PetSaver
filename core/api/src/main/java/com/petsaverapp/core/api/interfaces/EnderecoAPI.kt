package com.petsaverapp.core.api.interfaces

import com.petsaverapp.core.api.model.Endereco
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface EnderecoAPI {

    @GET("ws/{cep}/json/")
    suspend fun recuperarEndereco(
        @Path("cep") cep: String
    ): Response<Endereco>
}