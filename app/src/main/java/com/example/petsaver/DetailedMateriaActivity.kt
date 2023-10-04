package com.example.petsaver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.petsaver.databinding.ActivityDetailedMateriaBinding

class DetailedMateriaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailedMateriaBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_materia)
        binding = ActivityDetailedMateriaBinding.inflate(layoutInflater)


        //initNavigation()
    }

    /*private fun initNavigation() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        NavigationUI.setupWithNavController(binding.bottomNavBar, navController)
    }*/
}