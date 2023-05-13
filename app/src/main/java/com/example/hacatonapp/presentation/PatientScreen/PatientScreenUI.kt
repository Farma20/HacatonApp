package com.example.hacatonapp.presentation.PatientScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.hacatonapp.presentation.PatientScreen.ScreenElements.DetailCard
import com.example.hacatonapp.presentation.PatientScreen.ScreenElements.NavigationPatient
import com.example.hacatonapp.presentation.PatientScreen.ScreenElements.PersonPatientCard
import com.example.hacatonapp.ui.theme.DarkBlue
import com.example.hacatonapp.ui.theme.MainBlue
import com.example.hacatonapp.ui.theme.TextBlue


@Composable
fun PatientScreenUI(navController: NavController) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        color = MainBlue
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 20.dp, bottom = 20.dp, start = 30.dp, end = 30.dp)
        ) {
            PersonPatientCard("Анжелика", "Карпова", "Пациент")
            Spacer(modifier = Modifier.height(30.dp))
            DetailCard()
            Spacer(modifier = Modifier.height(30.dp))
            NavigationPatient(navController)
            Spacer(modifier = Modifier.height(30.dp))
            Button(
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = DarkBlue,
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .padding(top = 16.dp),
                onClick = {},
            ) {
                Text(
                    text = "ЗАПРОСИТЬ ИСТОРИЮ БОЛЕЗНИ (AI)",
                    modifier = Modifier.padding(vertical = 8.dp),
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}