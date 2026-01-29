package com.example.trivialapp_base.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.trivialapp_base.R
import com.example.trivialapp_base.Routes
import com.example.trivialapp_base.viewmodel.GameViewModel

@Composable
fun ResultScreen(navController: NavController, viewModel: GameViewModel) {
    val imageLevel = when {
        viewModel.puntuacion <= 40 -> R.drawable.homer_simpson
        viewModel.puntuacion < 70 -> R.drawable.promedio
        else -> R.drawable.cerebro_galaxia
    }

    Box(
        modifier = Modifier.
        fillMaxSize(),
        contentAlignment =  Alignment.Center){

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier
                    .padding(bottom = 50.dp),
                text = "Puntuación: ${viewModel.puntuacion}",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )

            Image(
                painter = painterResource(imageLevel),
                contentDescription = "Imagen puntuación: ${viewModel.puntuacion}",
                modifier = Modifier
                    .padding(bottom = 50.dp)
                    .size(300.dp),
            )

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.yellow_custom),
                    contentColor = Color.Black),
                modifier = Modifier
                    .padding(10.dp)
                    .size(150.dp, height = 70.dp)
            ) {
                Text(text = "Compartir",
                    fontSize = 18.sp,
                )
            }
            Button(
                onClick = {navController.navigate(Routes.MenuScreen.route)},
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.yellow_custom),
                    contentColor = Color.Black),
                modifier = Modifier
                    .padding(10.dp)
                    .size(200.dp, height = 70.dp)
            ) {
                Text(text = "Menú principal",
                    fontSize = 18.sp
                )
            }
        }

    }
}