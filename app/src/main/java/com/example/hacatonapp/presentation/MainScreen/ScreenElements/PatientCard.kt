package com.example.hacatonapp.presentation.MainScreen.ScreenElements

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fefu_fitnes_compose.Screens.Initialization.Navigation.Screen
import com.example.hacatonapp.R
import com.example.hacatonapp.ui.theme.MainBlue
import com.example.hacatonapp.ui.theme.TextBlue
import kotlin.random.Random

@Composable
fun PatientCard(firstName:String, secondName:String, diagnosis: String, room: Int = (1..99).random(), navController: NavController) {
    Card(
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier.fillMaxWidth().padding(6.dp).clickable {
            navController.navigate(Screen.PatientScreen.route)
        }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .padding(10.dp)
                    .clip(CircleShape)
                    .border(2.dp, MainBlue, CircleShape)
            ){
                Image(
                    modifier = Modifier.size(100.dp),
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = R.drawable.women1),
                    contentDescription = null
                )
            }
            Column(
                modifier = Modifier
                    .padding(start = 6.dp),
            ) {
                Row() {
                    Text(
                        text = firstName,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = TextBlue
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = secondName,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = TextBlue
                    )
                }
                Text(
                    text = diagnosis,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Light,
                    color = TextBlue
                )
                Text(
                    text = "Палата №${room}",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Light,
                    color = TextBlue
                )
            }
        }
    }
}