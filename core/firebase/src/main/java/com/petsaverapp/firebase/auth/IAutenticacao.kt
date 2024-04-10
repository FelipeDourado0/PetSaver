package com.petsaverapp.firebase.auth

import com.google.firebase.auth.FirebaseAuth

interface IAutenticacao {
    fun instanciarAuth(): FirebaseAuth
}