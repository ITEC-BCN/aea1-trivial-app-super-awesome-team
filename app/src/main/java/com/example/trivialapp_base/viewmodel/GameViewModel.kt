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
import kotlinx.coroutines.delay
import kotlin.collections.MutableList

class GameViewModel : ViewModel() {
    private var preguntasPartida: MutableList<Pregunta> = mutableListOf()
    var gameSize = 0
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
        juegoTerminado = false
        indicePreguntaActual = 0
        puntuacion = 0
        preguntasPartida.clear()
        var todasPreguntas = ProveedorPreguntas.obtenerPreguntas()
        todasPreguntas.forEach { preguntaIteracio ->
            if (preguntaIteracio.dificultad == dificultadSeleccionada) {
                preguntasPartida.add(preguntaIteracio)
            }
        }
        gameSize = preguntasPartida.size
        preguntasPartida.shuffle()
        cargarSiguientePregunta()
    }

    private fun cargarSiguientePregunta() {
        this.preguntaActual = preguntasPartida[indicePreguntaActual]
        respuestasMezcladas = listOf(
            preguntaActual?.respuesta1 as String,
            preguntaActual?.respuesta2 as String,
            preguntaActual?.respuesta3 as String,
            preguntaActual?.respuesta4 as String
        )
        iniciarTimer()
    }

    fun responderPregunta(respuestaUsuario: String) {
        timer?.cancel()
        if (respuestaUsuario == preguntaActual?.respuestaCorrecta){
            puntuacion+= 10
        }
        avanzarRonda()
        cargarSiguientePregunta()
    }

    private fun avanzarRonda() {
        if (indicePreguntaActual == preguntasPartida.size-1){
            juegoTerminado = true
            return
        }
        indicePreguntaActual += 1
    }

    private fun iniciarTimer() {
        timer?.cancel()
        timer = object : CountDownTimer(TIEMPO_POR_PREGUNTA, 100) {
            override fun onTick(millisUntilFinished: Long) {
                // Actualitzem l'estat directament
                tiempoRestante = millisUntilFinished.toFloat() / TIEMPO_POR_PREGUNTA
            }

            override fun onFinish() {
                tiempoRestante = 0f
                avanzarRonda()

                if (!juegoTerminado) {
                    cargarSiguientePregunta()
                }
            }
        }.start()
    }

    override fun onCleared() {
        super.onCleared()
        timer?.cancel()
    }
}
