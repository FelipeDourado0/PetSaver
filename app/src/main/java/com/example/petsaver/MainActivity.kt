package com.example.petsaver

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.petsaver.database_materia.model.MateriaDomain
import com.example.petsaver.databinding.ActivityMainBinding
import com.example.petsaver.repository.MateriaRepository
import com.example.petsaver.ui.dataEntities.Materia
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    @Inject
    lateinit var materiasRepository: MateriaRepository
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

    private suspend fun initialMateriasDatabase(materiaDao: MateriaRepository) {
        materiaDao.apagarDados()

        ///Add materias
        val materiasList = listOf(
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "aaaaaaaaaaaaa",
                title = "bbbbbbbbbbbbbbbbb",
                subTitle = "ccccccccccccccccccccccccc",
                mainText = " adasd das das dasd as asd as das ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
                imagePerfilUrl = "https://avatars.githubusercontent.com/u/75647938?v=4",
                imageBackGroundUrl = "https://www.selecoes.com.br/media/uploads/2023/01/chihuahua-racas-de-cachorro-pequeno.jpg",
                nameWriter = "zzzzzzzzzzzzzzz",
                title = "ddddddddddddddddddd",
                subTitle = "oooooooooooooooooooooooooooo",
                mainText = " fhsdfgh hjfgh erwergasdffdz fgsdfhjsgzx sdfgasdfa ",
                voceSabiaList = true,
                exploreList = true
            ),
            MateriaDomain(
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

        materiaDao.insereDadosInicias(materiasList)
    }

}
