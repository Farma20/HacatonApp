package com.example.fefu_fitnes_compose.Screens.BottomNavigate

import com.example.hacatonapp.R

sealed class BottomBarScreen(
    val rout: String,
    val title: String,
    val icon: Int,
){
    object Main: BottomBarScreen(
        rout = "mainScreen",
        title = "Главная",
        icon = R.drawable.home
    )

    object AllPatientsScreen: BottomBarScreen(
        rout = "allPatientsScreen",
        title = "Список всех пациентов",
        icon = R.drawable.patients
    )

    object PatientScreen: BottomBarScreen(
        rout = "patientScreen",
        title = "Пациент",
        icon = R.drawable.patients
    )

}