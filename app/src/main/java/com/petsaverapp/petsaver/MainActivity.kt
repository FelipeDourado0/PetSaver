package com.petsaverapp.petsaver

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.petsaverapp.R
import com.petsaverapp.core.data.database.model.MateriaDomain
import com.petsaverapp.core.repository.materiasRepository.MateriaRepository
import com.petsaverapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import java.util.Date
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    @Inject
    lateinit var materiasRepository: MateriaRepository

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        lifecycleScope.launch() {
            initialMateriasDatabase(materiasRepository)
        }

        /// INICIANDO NAVBOTTOM
        initNavigation()
    }

    private fun initNavigation() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        NavigationUI.setupWithNavController(binding.bottomNavBar, navController)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private suspend fun initialMateriasDatabase(materiaDao: MateriaRepository) {
        materiaDao.apagarDados()

        ///Add materias
        val materiasList: MutableList<MateriaDomain> = mutableListOf()

        for (i in 0..10) {
            val titulo: List<Char> = ('a'..'g') + 'c'
            val mainText: MutableList<Char> = mutableListOf()
            for (j in 0..80)
                mainText.addAll(('a'..'z'))

            materiasList.add(
                MateriaDomain(
                    imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                    imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                    nameWriter = "Felipe Teste",
                    title = titulo.shuffled().joinToString(""),
                    subTitle = titulo.shuffled().joinToString(""),
                    mainText = mainText.shuffled().joinToString(""),
                    voceSabiaList = i % 2 != 0,
                    exploreList = i % 2 == 0,
                    tema = "Saúde",
                    dataMateria = Date()
                )
            )
        }
        materiaDao.insereDadosInicias(materiasList)
    }

}
