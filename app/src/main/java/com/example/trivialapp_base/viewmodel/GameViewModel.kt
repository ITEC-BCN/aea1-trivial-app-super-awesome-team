package com.example.trivialapp_base.viewmodel

import android.os.CountDownTimer
import androidx.compose.material3.Button
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.trivialapp_base.Routes
import com.example.trivialapp_base.model.Pregunta
import com.example.trivialapp_base.model.ProveedorPreguntas

class GameViewModel : ViewModel() {
    private var preguntasPartida: MutableList<Pregunta> = mutableListOf()
    var indicePreguntaActual by mutableIntStateOf(0)
        private set

    var preguntaActual by mutableStateOf<Pregunta?>(null)
        private set

    var respuestasMezcladas by mutableStateOf<List<String>>(emptyList())
        private set

    var puntuacion by mutableIntStateOf(0)


    var tiempoRestante by mutableFloatStateOf(100f)
        private set

    var juegoTerminado by mutableStateOf(false)
        private set

    var dificultadSeleccionada by mutableStateOf("Facil")
        private set

    private var timer: CountDownTimer? = null
    private val TIEMPO_POR_PREGUNTA = 10000L // 10 segons

    fun setDificultad(dificultad: String) {
        dificultadSeleccionada = dificultad // Sense .value!
    }

    fun iniciarJuego() {
        var todasPreguntas = ProveedorPreguntas.obtenerPreguntas()
        todasPreguntas.forEach { preguntaIteracio ->
            if (preguntaIteracio.dificultad == dificultadSeleccionada) {
                preguntasPartida.add(preguntaIteracio)
            }
        }
        preguntasPartida.shuffle()
        this.preguntaActual = preguntasPartida[0]
        respuestasMezcladas = listOf(
            preguntaActual?.respuesta1 as String,
            preguntaActual?.respuesta2 as String,
            preguntaActual?.respuesta3 as String,
            preguntaActual?.respuesta4 as String
        ).shuffled()
    }

    private fun cargarSiguientePregunta() {
        indicePreguntaActual += 1
        this.preguntaActual = preguntasPartida[indicePreguntaActual]
        respuestasMezcladas = listOf(
            preguntaActual?.respuesta1 as String,
            preguntaActual?.respuesta2 as String,
            preguntaActual?.respuesta3 as String,
            preguntaActual?.respuesta4 as String
        ).shuffled()
    }

    fun responderPregunta(respuestaUsuario: String) {
        if (respuestaUsuario == preguntaActual?.respuestaCorrecta){
            puntuacion+= 10
        }
        avanzarRonda()
        if (juegoTerminado){
        }
        cargarSiguientePregunta()
    }

    private fun avanzarRonda() {
        if (indicePreguntaActual > preguntasPartida.size){
            juegoTerminado = true
        }

    }

    private fun iniciarTimer() {
    }

    override fun onCleared() {
        super.onCleared()
        timer?.cancel()
    }
}
