package com.petsaverapp.core.api.interfaces

import com.petsaverapp.core.api.model.Endereco
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface EnderecoAPI {

    @GET("ws/{cep}/json/")
    suspend fun recuperarEndereco(
        @Path("cep") cep: String
    ): Response<Endereco>


    //EXEMPLO DE SALVAR DE OUTRA FORMA
    /*@GET("json")
    suspend fun ObterDadosReferencia(
        @Query("cep") cep: String
    ): Response<Endereco>*/

    //EXEMPLO DE POST DE UMA FORMA
   /* @POST("posts")
    suspend fun salvarDadosReferencia(
        @Body cep: String //pode ser um tipo normal ou objeto
    ): Response<Endereco>*/

    //EXEMPLO DE POST DE UMA OUTRA FORMA
    /*@FormUrlEncoded
    @POST("posts")
    suspend fun salvarDadosReferencia(
        @Field("cep") cep: String,
        @Field("outroCampo") outro: String
    ): Response<Endereco>*/

    //EXEMPLO DE PUT DE UMA FORMA
     /*@PUT("posts/{id}")
     suspend fun atualizarDadosReferencia(
        @Path ("id") id:String, // parametro
        @Body cep: String //pode ser um tipo normal ou objeto // objeto para ser salvado
     ): Response<Endereco>*/

    //EXEMPLO DE PATCH DE UMA FORMA
    /*@PATCH("posts/{id}")
    suspend fun atualizarPatchDadosReferencia(
       @Path ("id") id:String, // parametro
       @Body cep: String //pode ser um tipo normal ou objeto // objeto para ser salvado
    ): Response<Endereco>*/

    //EXEMPLO DE DELETE
    /*@DELETE("posts/{id}")
    suspend fun deletarDadosReferencia(
        @Path ("id") id:String // parametro
    ): Response<Unit>*///DETALHE, TEM QUE SER Unit, para valor padrao


}