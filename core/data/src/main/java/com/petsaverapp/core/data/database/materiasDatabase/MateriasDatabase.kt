package com.petsaverapp.core.data.database.materiasDatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.petsaverapp.core.data.database.materiasDatabase.daos.MateriaDao
import com.petsaverapp.core.data.database.materiasDatabase.model.Conversor
import com.petsaverapp.core.data.database.materiasDatabase.model.MateriaDomain

@Database(entities = [MateriaDomain::class], version = 1, exportSchema = false)
@TypeConverters(Conversor::class)
abstract class MateriasDatabase: RoomDatabase() {

    abstract fun materiaDAO(): MateriaDao

    companion object{
        private const val DATABASE_NAME: String = "materias-database.db"

        @Volatile
        private var INSTANCE: MateriasDatabase? = null

        fun getDatabase(context: Context): MateriasDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MateriasDatabase::class.java,
                    "materias-database.db"
                ).build()

                INSTANCE = instance
                instance
            }
        }
    }
}