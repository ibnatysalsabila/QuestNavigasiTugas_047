package com.example.questnavigasitugas

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questnavigasitugas.view.Formulir
import com.example.questnavigasitugas.view.Home
import com.example.questnavigasitugas.view.ListData


enum class Navigasi {
    Home,
    Formulir,
    Detail
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {
    Scaffold { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Home.name,
            modifier = Modifier.padding(innerPadding)
        ) {

            composable(route = Navigasi.Home.name) {
                Home(
                    OnMasukBtnClick = {
                        navController.navigate(Navigasi.Detail.name)
                    }
                )
            }

            composable(route = Navigasi.Detail.name) {
                ListData(
                    OnFormulirClick = {
                        navController.navigate(Navigasi.Formulir.name)
                    },
                    OnBerandaClick = {
                        cancelAndBackToHome(navController)
                    }
                )
            }

            composable(route = Navigasi.Formulir.name) {
                Formulir(
                    OnBackBtnClick = {
                        navController.popBackStack(route = Navigasi.Detail.name, inclusive = false)
                    },
                    OnSubmitBtnClick = {
                        navController.popBackStack(route = Navigasi.Detail.name, inclusive = false)
                    }
                )
            }
        }
    }
}
