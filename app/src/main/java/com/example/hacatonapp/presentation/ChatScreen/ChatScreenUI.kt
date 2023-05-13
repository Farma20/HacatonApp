package com.example.hacatonapp.presentation.ChatScreen

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.navigation.NavController
import com.example.hacatonapp.ui.theme.greenColor
import java.util.*

@SuppressLint("UnusedMaterialScaffoldPaddingParameter", "UnrememberedMutableState")
@Composable
fun ChatScreenUI(navController: NavController) {
    val activity = LocalContext.current as Activity
    Surface(color = MaterialTheme.colors.background) {
        Scaffold {
            ChatScreen()
            SpeechToText(activity)
        }
    }
}

@SuppressLint("UnrememberedMutableState")
@Composable
fun SpeechToText(activity: Activity) {
    var outputTxt by mutableStateOf("Нажмите, чтобы начать запись")
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {

        Spacer(modifier = Modifier.height(30.dp))

        Button(

            elevation = ButtonDefaults.elevation(
                defaultElevation = 0.dp, pressedElevation = 0.dp, disabledElevation = 0.dp
            ),

            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),

            onClick = { getSpeechInput(context = context, activity) },
        ) {

            Icon(
                imageVector = Icons.Filled.Mic,
                contentDescription = "Mic",
                tint = greenColor,
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .padding(5.dp)
            )
        }
        Text(
            text = outputTxt,
            style = MaterialTheme.typography.h6,

            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun ChatScreen() {
    val messages = remember { mutableStateListOf("") }
    val newMessage = remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {
        LazyColumn(
            modifier = Modifier.weight(1f),
            contentPadding = PaddingValues(vertical = 8.dp)
        ) {
            items(messages.size) { id ->
                if (id != 0){
                    MessageItem(message = messages[id])
                }
            }
        }
    }
}

@Composable
fun MessageItem(message: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        backgroundColor = Color.LightGray,
        elevation = 4.dp
    ) {
        Text(
            text = message,
            fontSize = 18.sp,
            modifier = Modifier.padding(16.dp)
        )
    }
}

private fun getSpeechInput(context: Context, activity: Activity) {

    if (!SpeechRecognizer.isRecognitionAvailable(context)) {
        Toast.makeText(context, "Speech not Available", Toast.LENGTH_SHORT).show()
    } else {
        val intent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH)
        intent.putExtra(
            RecognizerIntent.EXTRA_LANGUAGE_MODEL,
            RecognizerIntent.LANGUAGE_MODEL_WEB_SEARCH
        )
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault())
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Speak Something")
        startActivityForResult(activity, intent, 101, null)
    }
}

