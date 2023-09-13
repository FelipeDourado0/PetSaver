package com.example.petsaver.application

import android.app.Application
import com.example.petsaver.database_materia.MateriasDatabase
import com.example.petsaver.repository.MateriaRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class MateriasApplication: Application() {

    val applicationScope = CoroutineScope(SupervisorJob())

    val materiasDatabaseApp by lazy { MateriasDatabase.getDatabase(applicationScope,this) }
    val materiasRepositoryApp by lazy { MateriaRepository(materiasDatabaseApp.materiaDAO()) }
}