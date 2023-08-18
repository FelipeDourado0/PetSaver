package com.example.petsaver.model

import com.example.petsaver.R

object ItemsCards {
    private val materias: MutableList<Materia> = mutableListOf(
        Materia(
            idImagePerfil = R.drawable.imagem_mulher,
            idImageBackGround = R.drawable.dog,
            title = "Tem tyu",
            subTitle = "Look to see",
            mainText = "SEM USO POR ENQUANTO"
        ),
        Materia(
            idImagePerfil = R.drawable.imagem_mulher,
            idImageBackGround = R.drawable.gato,
            title = "Tem 7",
            subTitle = "Look to see",
            mainText = "SEM USO POR ENQUANTO"
        ),
        Materia(
            idImagePerfil = R.drawable.imagem_mulher,
            idImageBackGround = R.drawable.dog,
            title = "Tem 5",
            subTitle = "Look to see",
            mainText = "SEM USO POR ENQUANTO"
        ),
        Materia(
            idImagePerfil = R.drawable.imagem_mulher,
            idImageBackGround = R.drawable.gato,
            title = "Tem 23",
            subTitle = "Look to see",
            mainText = "SEM USO POR ENQUANTO"
        ),
        Materia(
            idImagePerfil = R.drawable.imagem_mulher,
            idImageBackGround = R.drawable.dog,
            title = "Tem x jklfhbndsajkfbn fsdfsdfsd sdf asdf a  sdfasfas",
            subTitle = "Look to see",
            mainText = "SEM USO POR ENQUANTO"
        ),
        Materia(
            idImagePerfil = R.drawable.imagem_mulher,
            idImageBackGround = R.drawable.gato,
            title = "Tem m",
            subTitle = "Look to see",
            mainText = "SEM USO POR ENQUANTO"
        ),
        Materia(
            idImagePerfil = R.drawable.imagem_mulher,
            idImageBackGround = R.drawable.dog,
            title = "Tem a",
            subTitle = "Look to see",
            mainText = "SEM USO POR ENQUANTO"
        ),
    )

    fun returnItems(): List<Materia>{
        return materias.toList()
    }

}