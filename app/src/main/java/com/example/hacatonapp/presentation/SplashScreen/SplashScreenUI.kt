package com.example.hacatonapp.presentation.SplashScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hacatonapp.presentation.SplashScreen.ScreenElements.LoadingAnimation
import com.example.hacatonapp.ui.theme.MainBlue

@Preview(showBackground = true)
@Composable
fun SplashScreenUI() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MainBlue),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            modifier = Modifier
                .padding(top = 70.dp),
            text = "MedAI",
            fontWeight = FontWeight.Bold,
            fontSize = 70.sp,
            color = Color.White
        )
        LoadingAnimation(
            circleSize = 16.dp,
            circleColor = Color.White,
            spaceBetween = 12.dp,
            travelDistance = 15.dp
        )
    }
}