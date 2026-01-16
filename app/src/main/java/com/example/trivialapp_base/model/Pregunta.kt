package com.example.trivialapp_base.model

// Definición de la clase de datos Pregunta según requisitos
data class Pregunta(
    val pregunta: String,
    val categoria: String,
    val dificultad: String, // "Facil", "Medio", "Dificil"
    val respuesta1: String,
    val respuesta2: String,
    val respuesta3: String,
    val respuesta4: String,
    val respuestaCorrecta: String // Debe coincidir con una de las anteriores
)

// Objeto para simular la base de datos local (Hardcoded)
object ProveedorPreguntas {
    fun obtenerPreguntas(): MutableList<Pregunta> {
        return mutableListOf(
            Pregunta("¿Capital de Francia?", "Geografía", "Facil", "Madrid", "París", "Berlin", "Roma", "París"),
            Pregunta("¿Fórmula del agua?", "Ciencia", "Facil", "H2O", "CO2", "O2", "H2O2", "H2O"),
            Pregunta("¿Autor del Quijote?", "Literatura", "Facil", "Cervantes", "Quevedo", "Lope", "Góngora", "Cervantes"),
            Pregunta("¿Campeón mundial fútbol 2010?", "Deportes", "Facil", "Brasil", "Alemania", "España", "Italia", "España"),
            Pregunta("¿Rey de los dioses griegos?", "Mitología", "Facil", "Zeus", "Hades", "Poseidón", "Ares", "Zeus"),

            Pregunta("¿Quién pintó la Mona Lisa?", "Arte", "Medio", "Picasso", "Van Gogh", "Da Vinci", "Dalí", "Da Vinci"),
            Pregunta("¿Planeta más grande?", "Ciencia", "Medio", "Tierra", "Marte", "Júpiter", "Saturno", "Júpiter"),
            Pregunta("¿Año descubrimiento América?", "Historia", "Medio", "1492", "1500", "1485", "1992", "1492"),
            Pregunta("¿Moneda de Japón?", "Economía", "Medio", "Yuan", "Won", "Yen", "Dólar", "Yen"),
            Pregunta("¿Hueso más largo del cuerpo?", "Anatomía", "Medio", "Fémur", "Tibia", "Húmero", "Radio", "Fémur"),

            Pregunta("¿Elemento químico Au?", "Química", "Dificil", "Plata", "Oro", "Cobre", "Aluminio", "Oro"),
            Pregunta("¿Velocidad de la luz?", "Física", "Dificil", "300.000 km/s", "150.000 km/s", "1000 km/s", "Mach 1", "300.000 km/s"),
            Pregunta("¿Elemento quimico Fe?", "Quimica", "Dificil", "Fluor", "Hierro", "Arsenico", "Bismuto", "Hierro"),
            Pregunta("¿Que significa ADN?", "Biologia", "Dificil", "Ácido desoxirribonucleico", "Ácido dibonucleico", "Ajedrez Dominado por Nutrias", "Archivo de Nombres Olvidados", "Ácido desoxirribonucleico"),
            Pregunta("¿En que año se creo la polvora?", "Historia", "Dificil", "1205", "1203", "1201", "1200", "1200")

        )
    }
}