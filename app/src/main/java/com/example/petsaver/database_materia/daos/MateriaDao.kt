package com.example.petsaver.database_materia.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.petsaver.database_materia.model.Materia

@Dao
interface MateriaDao {
    @Query("SELECT * FROM materias WHERE voceSabiaList = 1")
    suspend fun getAllVoceSabiaItems(): MutableList<Materia>

    @Query("SELECT * FROM materias WHERE exploreList = 1")
    suspend fun getAllExploreItems(): MutableList<Materia>

    @Query("SELECT COUNT(materia_Id) FROM materias")
    suspend fun getTotalItems() : Long

    @Insert
    suspend fun insert(materia: Materia)

    @Insert
    suspend fun insertAll(listMaterias: List<Materia>)

    @Delete
    suspend fun deleteItem(materia: Materia)

    @Query("DELETE FROM materias")
    suspend fun deleteAllItems()

    @Update
    suspend fun updateItem(materia: Materia)
}