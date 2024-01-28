package com.petsaverapp.core.repository.apiRepository

import com.petsaverapp.core.api.interfaces.EnderecoAPI
import com.petsaverapp.core.api.model.Endereco
import retrofit2.Response

interface IEnderecoApiRepository {
    suspend fun getEndereco(cep: String): Response<Endereco>
}