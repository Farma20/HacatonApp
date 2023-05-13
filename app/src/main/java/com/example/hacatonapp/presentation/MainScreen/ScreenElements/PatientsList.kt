package com.example.hacatonapp.presentation.MainScreen.ScreenElements

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.hacatonapp.R
import com.example.hacatonapp.ui.theme.MainBlue
import com.example.hacatonapp.ui.theme.SecondaryBlue
import com.example.hacatonapp.ui.theme.TextBlue

@Composable
fun PatientsList(navController: NavController) {
    Box(modifier = Modifier
        .fillMaxWidth()
    ){
        List(navController)
        UppBar()
    }
}

@Composable
private fun List(navController: NavController){
    Card(
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .fillMaxSize(),
        backgroundColor = SecondaryBlue
    ) {
        LazyColumn(
            modifier = Modifier
                .padding(start = 12.dp, end = 12.dp)
                .fillMaxWidth()
        ){
            item { Spacer(modifier = Modifier.height(50.dp)) }
            items(5){
                PatientCard("Анджелика", "Карпова", "Острая шизофрения", navController = navController)
            }
            item { Spacer(modifier = Modifier.height(8.dp)) }
        }
    }
}

@Composable
private fun UppBar(){
    Card(
        shape = RoundedCornerShape(10.dp),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier
                    .padding(start = 16.dp),
                text = "Мои пациенты",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = TextBlue
            )
            Row(
                modifier = Modifier
                    .padding(end = 16.dp),
            ) {
                IconButton(onClick = {}) {
                    Image(
                        modifier = Modifier
                            .size(45.dp, 45.dp),
                        painter = painterResource(id = R.drawable.baseline_search_24),
                        contentDescription = null,
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                IconButton(onClick = {}) {
                    Image(
                        modifier = Modifier
                            .size(45.dp, 40.dp),
                        painter = painterResource(id = R.drawable.baseline_format_align_left_24),
                        contentDescription = null
                    )
                }
            }
        }
    }
}