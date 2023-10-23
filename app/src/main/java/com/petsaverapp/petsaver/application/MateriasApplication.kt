package com.petsaverapp.petsaver.application

import android.app.Application
import com.petsaverapp.petsaver.database_materia.MateriasDatabase
import com.petsaverapp.petsaver.repository.MateriaRepository
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

@HiltAndroidApp
class MateriasApplication: Application() {
}