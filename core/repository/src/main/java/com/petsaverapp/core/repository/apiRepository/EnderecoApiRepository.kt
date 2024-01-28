package com.petsaverapp.core.repository.apiRepository

import com.petsaverapp.core.api.interfaces.EnderecoAPI
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class EnderecoApiRepository @Inject constructor(
    private val enderecoApiService: EnderecoAPI
): IEnderecoApiRepository {
    override suspend fun getEndereco(cep: String) = enderecoApiService.recuperarEndereco(cep)
}