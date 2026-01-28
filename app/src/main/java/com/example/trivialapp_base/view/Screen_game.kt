package com.example.trivialapp_base.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.trivialapp_base.R
import com.example.trivialapp_base.model.Pregunta
import com.example.trivialapp_base.model.ProveedorPreguntas
import com.example.trivialapp_base.viewmodel.GameViewModel

@Composable
fun GameScreen(navController: NavController, viewModel: GameViewModel) {
    var activeQuestion = 1
    val defaultColor = colorResource(R.color.yellow_custom)
    var buttonColor by remember { mutableStateOf(defaultColor) }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column() {
            Text(text = "${viewModel.preguntaActual?.pregunta}" )
            Text(text = "Pregunta $activeQuestion")

            Row() {
                Button(
                    onClick = {
                        viewModel.responderPregunta(viewModel.respuestasMezcladas[0])
                        buttonColor = if (viewModel.respuestasMezcladas[0] == viewModel.preguntaActual?.respuestaCorrecta){
                            Color.Green
                        } else {
                            Color.Red
                        }
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = buttonColor,
                        contentColor = Color.Black)
                ) {
                    Text(text = viewModel.respuestasMezcladas[0])
                }
                Button(
                    onClick = {
                        viewModel.responderPregunta(viewModel.respuestasMezcladas[1])
                        buttonColor = if (viewModel.respuestasMezcladas[1] == viewModel.preguntaActual?.respuestaCorrecta){
                            Color.Green
                        } else {
                            Color.Red
                        }
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = buttonColor,
                        contentColor = Color.Black)
                ) {
                    Text(text = viewModel.respuestasMezcladas[1])
                }
            }
            Row() {
                Button(onClick = {
                    viewModel.responderPregunta(viewModel.respuestasMezcladas[2])
                    buttonColor = if (viewModel.respuestasMezcladas[2] == viewModel.preguntaActual?.respuestaCorrecta){
                        Color.Green
                    } else {
                        Color.Red
                    }
                },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = buttonColor,
                        contentColor = Color.Black)
                ) {
                    Text(text = viewModel.respuestasMezcladas[2])
                }
                Button(onClick = {
                    viewModel.responderPregunta(viewModel.respuestasMezcladas[3])
                    buttonColor = if (viewModel.respuestasMezcladas[3] == viewModel.preguntaActual?.respuestaCorrecta){
                            Color.Green
                        } else {
                            Color.Red
                        }
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = buttonColor,
                        contentColor = Color.Black)
                ) {
                    Text(text = viewModel.respuestasMezcladas[3])
                }
            }
        }
    }
}


