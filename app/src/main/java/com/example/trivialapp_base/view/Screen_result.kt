package com.example.trivialapp_base.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.trivialapp_base.viewmodel.GameViewModel

@Composable
fun ResultScreen(navController: NavController, viewModel: GameViewModel) {
    Box(
        modifier = Modifier.
        fillMaxSize(),
        contentAlignment =  Alignment.Center){
        Column() {
            Text(text = "Your Score")
            Text(text = "${viewModel.puntuacion}")
            Button(onClick = {}) {
                Text(text = "Share")
            }
            Button(onClick = {}) {
                Text(text = "Return to menu")
            }
        }

    }
}