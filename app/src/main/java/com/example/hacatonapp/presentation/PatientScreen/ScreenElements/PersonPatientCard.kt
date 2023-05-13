package com.example.hacatonapp.presentation.PatientScreen.ScreenElements

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
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
import com.example.hacatonapp.R
import com.example.hacatonapp.ui.theme.MainBlue
import com.example.hacatonapp.ui.theme.TextBlue


@Composable
fun PersonPatientCard(firstName:String, secondName:String, status: String) {
    Card(
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Box(
                modifier = Modifier
                    .padding(10.dp)
                    .clip(CircleShape)
                    .border(2.dp, MainBlue, CircleShape)
            ){
                Image(
                    modifier = Modifier.size(140.dp),
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = R.drawable.women1),
                    contentDescription = null
                )
            }
            Column(
                modifier = Modifier
                    .padding(bottom = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
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
                    text = status,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Light,
                    color = TextBlue
                )
            }
        }
    }
}