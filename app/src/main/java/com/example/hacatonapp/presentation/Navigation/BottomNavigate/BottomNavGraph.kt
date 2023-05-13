package com.example.fefu_fitnes_compose.Screens.BottomNavigate

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.hacatonapp.presentation.AllPatientsScreen.AllPatientsScreenUI
import com.example.hacatonapp.presentation.MainScreen.MainScreenUI
import com.example.hacatonapp.presentation.Navigation.MainMenuNav
import com.example.hacatonapp.presentation.ViewModel
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.navigation
import com.google.accompanist.navigation.animation.composable



@OptIn(ExperimentalAnimationApi::class)
@Composable
fun BottomNavGraph(navController: NavHostController, viewModel:ViewModel){
    AnimatedNavHost(
        navController = navController,
        startDestination = BottomBarScreen.Main.rout
    ){
        composable(
            route = BottomBarScreen.Main.rout,
        ){
            MainMenuNav(viewModel)
        }
        composable(
            route = BottomBarScreen.AllPatientsScreen.rout,
        ){
            AllPatientsScreenUI()
        }

    }
}