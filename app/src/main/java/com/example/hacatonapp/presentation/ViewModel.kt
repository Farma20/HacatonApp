package com.example.hacatonapp.presentation

import androidx.compose.runtime.mutableStateListOf

class ViewModel: androidx.lifecycle.ViewModel() {
    val text = mutableStateListOf("")
}