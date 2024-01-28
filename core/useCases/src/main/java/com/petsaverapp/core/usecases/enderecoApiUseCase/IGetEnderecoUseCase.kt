package com.petsaverapp.core.usecases.enderecoApiUseCase

import com.petsaverapp.core.api.model.Endereco
import retrofit2.Response

interface IGetEnderecoUseCase {
    suspend fun obterEnderecoDaApi(cep: String): Response<Endereco>
}