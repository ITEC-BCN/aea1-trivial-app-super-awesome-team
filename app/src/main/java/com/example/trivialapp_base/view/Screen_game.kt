package com.example.trivialapp_base.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.trivialapp_base.model.Pregunta
import com.example.trivialapp_base.model.ProveedorPreguntas
import com.example.trivialapp_base.viewmodel.GameViewModel

@Composable
fun GameScreen(navController: NavController, viewModel: GameViewModel) {
    var activeQuestion: Int = 1
    val numQuestions = 10
    val questions = ProveedorPreguntas.obtenerPreguntas()
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column() {
            Text(text = "${viewModel.preguntaActual?.pregunta}" )
            Text(text = "Round $activeQuestion/10")

            Row() {
                Button(onClick = {}) {
                    Text(text = "${questions.find { it.pregunta == "¿Capital de Francia?" }?.respuesta1}")
                }
                Button(onClick = {}) {
                    Text(text = "${questions.find { it.pregunta == "¿Capital de Francia?" }?.respuesta2}")
                }
            }
            Row() {
                Button(onClick = {}) {
                    Text(text = "${questions.find { it.pregunta == "¿Capital de Francia?" }?.respuesta3}")
                }
                Button(onClick = {}) {
                    Text(text = "${questions.find { it.pregunta == "¿Capital de Francia?" }?.respuesta4}")
                }
            }

        }
    }
}


