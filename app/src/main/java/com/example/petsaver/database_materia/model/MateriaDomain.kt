package com.example.petsaver.database_materia.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "materias")
data class MateriaDomain(
    @ColumnInfo(name = "imagem_perfil") val imagePerfilUrl: String,
    @ColumnInfo(name = "imagem_BackGround") val imageBackGroundUrl: String,
    @ColumnInfo(name = "name_Writer") val nameWriter: String,
    val title: String,
    val subTitle: String,
    val mainText:String,
    val voceSabiaList: Boolean,
    val exploreList: Boolean
){
    @PrimaryKey
    @ColumnInfo(name = "materia_Id") var materiaId : UUID = UUID.randomUUID()
}
