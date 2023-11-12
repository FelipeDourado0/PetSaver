package com.petsaverapp.core.data.database.materiasDatabase.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.petsaverapp.core.data.database.materiasDatabase.model.MateriaDomain

@Dao
interface MateriaDao {
    @Query("SELECT * FROM materias WHERE voceSabiaList = 1")
    suspend fun getAllVoceSabiaItems(): MutableList<MateriaDomain>

    @Query("SELECT * FROM materias WHERE exploreList = 1")
    suspend fun getAllExploreItems(): MutableList<MateriaDomain>

    @Query("SELECT COUNT(materia_Id) FROM materias")
    suspend fun getTotalItems() : Long

    @Insert
    suspend fun insert(materia: MateriaDomain)

    @Insert
    suspend fun insertAll(listMaterias: List<MateriaDomain>)

    @Delete
    suspend fun deleteItem(materia: MateriaDomain)

    @Query("DELETE FROM materias")
    suspend fun deleteAllItems()

    @Update
    suspend fun updateItem(materia: MateriaDomain)
}