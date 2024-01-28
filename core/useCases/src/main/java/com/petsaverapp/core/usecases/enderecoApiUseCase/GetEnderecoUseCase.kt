package com.petsaverapp.core.usecases.enderecoApiUseCase

import com.petsaverapp.core.api.model.Endereco
import com.petsaverapp.core.repository.apiRepository.IEnderecoApiRepository
import retrofit2.Response
import javax.inject.Inject

class GetEnderecoUseCase @Inject constructor(
    private val enderecoRepository: IEnderecoApiRepository
):IGetEnderecoUseCase {
    override suspend fun obterEnderecoDaApi(cep: String): Response<Endereco> = enderecoRepository.getEndereco(cep)

}