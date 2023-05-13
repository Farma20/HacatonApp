package com.example.fefu_fitnes_compose.Screens.Initialization.Navigation

sealed class Screen(val route: String){
    object MainScreen: Screen("mainScreen")
    object AllPatientsScreen: Screen("allPatientsScreen")
    object PatientScreen: Screen("patientScreen")
    object ChatScreen: Screen("chatScreen")
    object PatientHistoryScreen: Screen("PatientHistoryScreen")
}
