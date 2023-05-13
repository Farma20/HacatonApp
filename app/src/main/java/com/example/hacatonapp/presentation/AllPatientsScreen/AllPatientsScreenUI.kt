package com.example.hacatonapp.presentation.AllPatientsScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.hacatonapp.presentation.AllPatientsScreen.ScreenElements.AllPatientsList
import com.example.hacatonapp.ui.theme.MainBlue

@Composable
fun AllPatientsScreenUI() {
    Box(modifier = Modifier.background(MainBlue)){
        AllPatientsList()
    }
}