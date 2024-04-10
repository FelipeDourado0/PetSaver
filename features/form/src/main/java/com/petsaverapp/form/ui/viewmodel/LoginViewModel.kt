package com.petsaverapp.form.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.petsaverapp.firebase.auth.IAutenticacao
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val autenticacao: IAutenticacao
): ViewModel() {

    fun usuarioAutenticado(): Boolean {
        return autenticacao.instanciarAuth().currentUser != null
    }
    fun efetuarLogin(email: String, senha: String): LiveData<ResponseLogin>{
        val observaLoging: MutableLiveData<ResponseLogin> = MutableLiveData()
        if(!(email.isEmpty() || senha.isEmpty())) {
            autenticacao.instanciarAuth().signInWithEmailAndPassword(email, senha)
                .addOnSuccessListener {
                    observaLoging.value = ResponseLogin("", true)
                }
                .addOnFailureListener {
                    observaLoging.value = ResponseLogin("Erro ao efetuar o login.", false)
                }
        }else
            observaLoging.value = ResponseLogin("Email ou senha inválidos.", false)

        return observaLoging
    }

}

data class ResponseLogin(
    var mensagemErro: String,
    var loginEfetuado:Boolean
)