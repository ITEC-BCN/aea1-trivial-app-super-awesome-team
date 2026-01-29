package com.example.trivialapp_base.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.trivialapp_base.R
import com.example.trivialapp_base.Routes
import com.example.trivialapp_base.model.Pregunta
import com.example.trivialapp_base.model.ProveedorPreguntas
import com.example.trivialapp_base.viewmodel.GameViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun GameScreen(navController: NavController, viewModel: GameViewModel) {
    val scope = rememberCoroutineScope()
    val defaultColor = colorResource(R.color.yellow_custom)
    var buttonColorOne by remember { mutableStateOf(defaultColor) }
    var buttonColorTwo by remember { mutableStateOf(defaultColor) }
    var buttonColorThree by remember { mutableStateOf(defaultColor) }
    var buttonColorFour by remember { mutableStateOf(defaultColor) }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "${viewModel.preguntaActual?.pregunta}",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(20.dp),
                textAlign = TextAlign.Center,
                lineHeight = 1.2.em
            )
            Text(text = "Pregunta ${viewModel.indicePreguntaActual+1}/${viewModel.gameSize}",
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(bottom = 20.dp),
            )

            Row() {
                Button(
                    onClick = {
                        buttonColorOne = if (viewModel.respuestasMezcladas[0] == viewModel.preguntaActual?.respuestaCorrecta){
                            Color.Green
                        } else {
                            Color.Red
                        }
                        scope.launch {
                            delay(500)
                            viewModel.responderPregunta(viewModel.respuestasMezcladas[0])
                            buttonColorOne = defaultColor
                            if (viewModel.juegoTerminado){
                                navController.navigate(Routes.ResultScreen.route)
                            }
                        }
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = buttonColorOne,
                        contentColor = Color.Black),
                    shape = MaterialTheme.shapes.medium,
                    modifier = Modifier
                        .padding(10.dp)
                        .size(160.dp, height = 80.dp)
                ) {
                    Text(text = viewModel.respuestasMezcladas[0],
                        fontSize = 16.sp)
                }
                Button(
                    onClick = {
                        buttonColorTwo = if (viewModel.respuestasMezcladas[1] == viewModel.preguntaActual?.respuestaCorrecta){
                            Color.Green
                        } else {
                            Color.Red
                        }
                        scope.launch {
                            delay(500)
                            viewModel.responderPregunta(viewModel.respuestasMezcladas[1])
                            buttonColorTwo = defaultColor
                            if (viewModel.juegoTerminado){
                                navController.navigate(Routes.ResultScreen.route)
                            }
                        }
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = buttonColorTwo,
                        contentColor = Color.Black),
                    shape = MaterialTheme.shapes.medium,
                    modifier = Modifier
                        .padding(10.dp)
                        .size(160.dp, height = 80.dp)
                ) {
                    Text(text = viewModel.respuestasMezcladas[1],
                        fontSize = 16.sp)
                }
            }
            Row() {
                Button(
                    onClick = {
                        buttonColorThree = if (viewModel.respuestasMezcladas[2] == viewModel.preguntaActual?.respuestaCorrecta){
                            Color.Green
                        } else {
                            Color.Red
                        }
                        scope.launch {
                            delay(500)
                            viewModel.responderPregunta(viewModel.respuestasMezcladas[2])
                            buttonColorThree = defaultColor
                            if (viewModel.juegoTerminado){
                                navController.navigate(Routes.ResultScreen.route)
                            }
                        }
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = buttonColorThree,
                        contentColor = Color.Black),
                    shape = MaterialTheme.shapes.medium,
                    modifier = Modifier
                        .padding(10.dp)
                        .size(160.dp, height = 80.dp)
                ) {
                    Text(text = viewModel.respuestasMezcladas[2],
                        fontSize = 16.sp)
                }
                Button(
                    onClick = {
                        buttonColorFour = if (viewModel.respuestasMezcladas[3] == viewModel.preguntaActual?.respuestaCorrecta){
                            Color.Green
                        } else {
                            Color.Red
                        }
                        scope.launch {
                            delay(500)
                            viewModel.responderPregunta(viewModel.respuestasMezcladas[3])
                            buttonColorFour = defaultColor
                            if (viewModel.juegoTerminado){
                                navController.navigate(Routes.ResultScreen.route)
                            }
                        }
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = buttonColorFour,
                        contentColor = Color.Black),
                    shape = MaterialTheme.shapes.medium,
                    modifier = Modifier
                        .padding(10.dp)
                        .size(160.dp, height = 80.dp)
                ) {
                    Text(text = viewModel.respuestasMezcladas[3],
                        fontSize = 16.sp)
                }
            }
        }
    }
}


