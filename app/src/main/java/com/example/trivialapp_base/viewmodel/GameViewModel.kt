package com.example.trivialapp_base.viewmodel

import android.os.CountDownTimer
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.trivialapp_base.model.Pregunta

class GameViewModel : ViewModel() {
    private var preguntasPartida: List<Pregunta> = emptyList()
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

    private var timer: CountDownTimer? = null //controla el timer
    private val TIEMPO_POR_PREGUNTA = 10000L // 10 segons

    fun setDificultad(dificultad: String) {
        dificultadSeleccionada = dificultad // Sense .value!
    }
    fun iniciarJuego() {

    }

    private fun cargarSiguientePregunta() {
    }

    fun responderPregunta(respuestaUsuario: String) {
    }

    private fun avanzarRonda() {
    }

    private fun iniciarTimer() {
        timer?.cancel()
        timer = object : CountDownTimer(TIEMPO_POR_PREGUNTA, 100){
            override fun onTick(millisUntilFinished: Long) {
                //actualizamos el estado directamente
                tiempoRestante = millisUntilFinished.toFloat() / TIEMPO_POR_PREGUNTA
            }

            override fun onFinish() {
                tiempoRestante = 0f
                //carregar seguent pregunta
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        timer?.cancel()
    }
}
