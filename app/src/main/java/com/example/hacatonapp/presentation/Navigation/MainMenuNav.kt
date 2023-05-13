package com.example.hacatonapp.presentation.Navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.runtime.Composable
import com.example.fefu_fitnes_compose.Screens.Initialization.Navigation.Screen
import com.example.hacatonapp.presentation.ChatScreen.ChatScreenUI
import com.example.hacatonapp.presentation.MainScreen.MainScreenUI
import com.example.hacatonapp.presentation.PatientScreen.PatientScreenUI
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.rememberAnimatedNavController


@OptIn(ExperimentalAnimationApi::class)
@Composable
fun MainMenuNav() {
    val navController = rememberAnimatedNavController()
    AnimatedNavHost(navController = navController, startDestination = Screen.MainScreen.route){
        composable(
            route = Screen.MainScreen.route,
            exitTransition = {
                slideOutHorizontally (
                    targetOffsetX = {-1500},
                    animationSpec = tween(
                        durationMillis = 400,
                        easing = FastOutSlowInEasing
                    )
                )
            },
            popEnterTransition = {
                slideInHorizontally (
                    initialOffsetX = {-1500},
                    animationSpec = tween(
                        durationMillis = 400,
                        easing = FastOutSlowInEasing
                    )
                )
            },
        ){
            MainScreenUI(navController)
        }
        composable(
            route = Screen.PatientScreen.route,
            enterTransition = {
                slideInHorizontally (
                    initialOffsetX = {1500},
                    animationSpec = tween(
                        durationMillis = 400,
                        easing = FastOutSlowInEasing
                    )
                )
            },
            popExitTransition = {
                slideOutHorizontally (
                    targetOffsetX = {1500},
                    animationSpec = tween(
                        durationMillis = 400,
                        easing = FastOutSlowInEasing
                    )
                )
            },
        ){
            PatientScreenUI(navController)
        }

        composable(
            route = Screen.ChatScreen.route,
            enterTransition = {
                slideInHorizontally (
                    initialOffsetX = {1500},
                    animationSpec = tween(
                        durationMillis = 400,
                        easing = FastOutSlowInEasing
                    )
                )
            },
            popExitTransition = {
                slideOutHorizontally (
                    targetOffsetX = {1500},
                    animationSpec = tween(
                        durationMillis = 400,
                        easing = FastOutSlowInEasing
                    )
                )
            },
        ){
            ChatScreenUI(navController)
        }
    }
}
