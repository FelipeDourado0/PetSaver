package com.petsaverapp.form.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.petsaverapp.core.usecases.enderecoApiUseCase.IGetEnderecoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.async
import javax.inject.Inject

@HiltViewModel
class CadastroUsuarioViewModel @Inject constructor(
    private val enderecoApiUseCase: IGetEnderecoUseCase
): ViewModel() {
    private val _observaEndereco: MutableLiveData<EnderecoObservable> = MutableLiveData()
    val observaEndereco: LiveData<EnderecoObservable> = _observaEndereco
    suspend fun recuperarDadosEndereco(cep: String){
        var enderecoCompleto =  viewModelScope.async{
            val result = enderecoApiUseCase.obterEnderecoDaApi(cep).body()
            _observaEndereco.postValue(EnderecoObservable(result?.logradouro ?: "",result?.uf ?: "",result?.localidade ?: ""))
        }
    }

    data class EnderecoObservable(
        var endereco: String,
        var uf: String,
        var localidade: String
    )
}

