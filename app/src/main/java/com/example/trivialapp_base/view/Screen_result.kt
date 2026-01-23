package com.example.trivialapp_base.view

import androidx.compose.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.trivialapp_base.R
import com.example.trivialapp_base.Routes
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
            Button(
                onClick = {navController.navigate(Routes.MenuScreen.route)},
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.purple_200),
                    contentColor = Color.Black),
                modifier = Modifier
                    .padding(30.dp)
                    .size(100.dp),
            ) {
                Text(text = "Return to menu")
            }
        }

    }
}