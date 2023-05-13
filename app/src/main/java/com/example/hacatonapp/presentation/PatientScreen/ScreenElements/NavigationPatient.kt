package com.example.hacatonapp.presentation.PatientScreen.ScreenElements

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fefu_fitnes_compose.Screens.Initialization.Navigation.Screen
import com.example.hacatonapp.R
import com.example.hacatonapp.presentation.MainScreen.ScreenElements.PatientCard
import com.example.hacatonapp.ui.theme.SecondaryBlue
import com.example.hacatonapp.ui.theme.Shapes
import com.example.hacatonapp.ui.theme.TextBlue

@Composable
fun NavigationPatient(navController:NavController) {
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
       Column(
           horizontalAlignment = Alignment.CenterHorizontally
       ) {
           Spacer(modifier = Modifier.height(70.dp))
           Button(
               shape = RoundedCornerShape(10.dp),
               colors = ButtonDefaults.buttonColors(
                   backgroundColor = Color.White,
                   contentColor = TextBlue
               ),
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(horizontal = 16.dp),
               onClick = {navController.navigate(Screen.ChatScreen.route)},
           ) {
               Text(
                   text = "ОТЧЕТ ПО ОБХОДУ",
                   modifier = Modifier.padding(vertical = 8.dp),
                   fontWeight = FontWeight.Bold
               )
           }
           Button(
               shape = RoundedCornerShape(10.dp),
               colors = ButtonDefaults.buttonColors(
                   backgroundColor = Color.White,
                   contentColor = TextBlue
               ),
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(horizontal = 16.dp)
                   .padding(top = 16.dp),
               onClick = {navController.navigate(Screen.ChatScreen.route)},
           ) {
               Text(
                   text = "ОТЧЕТ ПО АНАЛИЗАМ",
                   modifier = Modifier.padding(vertical = 8.dp),
                   fontWeight = FontWeight.Bold
               )
           }
           Button(
               shape = RoundedCornerShape(10.dp),
               colors = ButtonDefaults.buttonColors(
                   backgroundColor = Color.White,
                   contentColor = TextBlue
               ),
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(horizontal = 16.dp)
                   .padding(vertical = 16.dp),
               onClick = {navController.navigate(Screen.ChatScreen.route)},
           ) {
               Text(
                   text = "ОТЧЕТ ПО МАНИПУЛЯЦИЯМ",
                   modifier = Modifier.padding(vertical = 8.dp),
                   fontWeight = FontWeight.Bold
               )
           }
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
                .fillMaxWidth()
                .padding(vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier
                    .padding(start = 16.dp),
                text = "Записать отчет",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = TextBlue
            )
        }
    }
}