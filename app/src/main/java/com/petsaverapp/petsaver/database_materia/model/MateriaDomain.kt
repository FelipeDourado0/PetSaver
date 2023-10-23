package com.petsaverapp.petsaver.database_materia.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date
import java.util.UUID

@Entity(tableName = "materias")
data class MateriaDomain(
    @ColumnInfo(name = "imagem_perfil") var imagePerfilUrl: String,
    @ColumnInfo(name = "imagem_BackGround") var imageBackGroundUrl: String,
    @ColumnInfo(name = "name_Writer") var nameWriter: String,
    var title: String,
    var subTitle: String,
    var mainText:String,
    val tema: String,
    var voceSabiaList: Boolean,
    var exploreList: Boolean,
    var dataMateria: Date

){
    @PrimaryKey
    @ColumnInfo(name = "materia_Id") var materiaId : UUID = UUID.randomUUID()
}
