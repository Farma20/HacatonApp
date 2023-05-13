package com.example.hacatonapp.presentation.MainScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.hacatonapp.presentation.MainScreen.ScreenElements.PatientsList
import com.example.hacatonapp.presentation.MainScreen.ScreenElements.PersonCard
import com.example.hacatonapp.ui.theme.MainBlue

@Composable
fun MainScreenUI(navController: NavController) {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = MainBlue
    ) {
        Column(
            modifier = Modifier
                .padding(56.dp)
        ) {
            PersonCard("Джонни", "Синс", "Врач-терапевт")
            Spacer(modifier = Modifier.height(25.dp))
            PatientsList(navController)
        }
    }
}