package com.example.petsaver.application

import android.app.Application
import com.example.petsaver.database_materia.MateriasDatabase
import com.example.petsaver.repository.MateriaRepository
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

@HiltAndroidApp
class MateriasApplication: Application() {
}