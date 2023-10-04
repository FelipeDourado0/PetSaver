package com.example.petsaver.database_materia

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.petsaver.database_materia.daos.MateriaDao
import com.example.petsaver.database_materia.model.MateriaDomain

@Database(entities = [MateriaDomain::class], version = 1, exportSchema = false)
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

    /*private class InitialDataCallBack(
        private val scope: CoroutineScope
    ): Callback(){
        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)
            INSTANCE?.let { database ->
                scope.launch {
                    populateDatabase(database.materiaDAO())
                }
            }
        }

        suspend fun populateDatabase(materiaDao: MateriaDao){
            ///Delete all content
            //materiaDao.deleteAllItems()

            ///Add materias
            val materiasList = listOf(
                Materia(
                    imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                    imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                    nameWriter = "aaaaaaaaaaaaa",
                    title = "bbbbbbbbbbbbbbbbb",
                    subTitle = "ccccccccccccccccccccccccc",
                    mainText = " adasd das das dasd as asd as das ",
                    voceSabiaList = true,
                    exploreList = true
                ),
                Materia(
                    imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                    imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                    nameWriter = "zzzzzzzzzzzzzzz",
                    title = "ddddddddddddddddddd",
                    subTitle = "oooooooooooooooooooooooooooo",
                    mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                    voceSabiaList = true,
                    exploreList = true
                )
            )

            materiaDao.insertAll(materiasList)
        }
    }*/




}