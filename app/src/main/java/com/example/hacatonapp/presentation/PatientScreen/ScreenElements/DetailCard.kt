package com.example.hacatonapp.presentation.PatientScreen.ScreenElements

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hacatonapp.ui.theme.TextBlue

@Composable
fun DetailCard() {
    Card(
        shape = RoundedCornerShape(10.dp),
    ) {
        Column(
            Modifier.fillMaxWidth().padding(vertical = 8.dp).padding(start = 22.dp)
        ) {
            Row(){
                Text(
                    text = "Диагноз: ",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = TextBlue
                )
                Text(
                    text = "Подозрение на гипертонию",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Medium,
                    color = TextBlue
                )
            }
            Row(){
                Text(
                    text = "Палата №",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = TextBlue
                )
                Text(
                    text = "17",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Medium,
                    color = TextBlue
                )
            }
        }
    }
}