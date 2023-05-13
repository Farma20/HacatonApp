package com.example.hacatonapp.presentation

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mic
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.fefu_fitnes_compose.Screens.BottomNavigate.NavMainScreen
import com.example.fefu_fitnes_compose.Screens.Initialization.Navigation.Screen
import com.example.hacatonapp.presentation.ChatScreen.ChatScreenUI
import com.example.hacatonapp.presentation.SplashScreen.SplashScreenUI
import com.example.hacatonapp.ui.theme.HacatonAppTheme
import com.example.hacatonapp.ui.theme.greenColor
import kotlinx.coroutines.delay
import java.util.*

class MainActivity : ComponentActivity() {
    var outputTxt by mutableStateOf("Click button for Speech text ")

    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HacatonAppTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                ) {

                    var time by remember { mutableStateOf(0) }

                    LaunchedEffect(Unit) {
                        while (time < 3) {
                            delay(1000)
                            time++
                        }
                    }
                    SplashScreenUI()
                    if (time == 3)
                        NavMainScreen()
//                    ChatScreenUI()

                }
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 101 && resultCode == Activity.RESULT_OK) {
            val result = data?.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS)
            outputTxt = result?.get(0).toString()
        }
    }
}


