package com.petsaverapp.firebase.auth

import com.google.firebase.auth.FirebaseAuth
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Autenticacao @Inject constructor(): IAutenticacao {
    override fun instanciarAuth(): FirebaseAuth = FirebaseAuth.getInstance()

}