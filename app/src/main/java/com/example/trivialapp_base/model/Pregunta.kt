package com.example.trivialapp_base.model

import com.example.trivialapp_base.R

// Definición de la clase de datos Pregunta según requisitos
data class Pregunta(
    val pregunta: String,
    val categoria: String,
    val dificultad: String, // "Facil", "Medio", "Dificil"
    val respuesta1: String,
    val respuesta2: String,
    val respuesta3: String,
    val respuesta4: String,
    val respuestaCorrecta: String, // Debe coincidir con una de las anteriores
    val image: Int
)

// Objeto para simular la base de datos local (Hardcoded)
object ProveedorPreguntas {
    fun obtenerPreguntas(): MutableList<Pregunta> {
        return mutableListOf(
            Pregunta("¿Capital de Francia?", "Geografía", "Facil", "Madrid", "París", "Berlin", "Roma", "París", R.drawable.francia_capital),
            Pregunta("¿Fórmula del agua?", "Ciencia", "Facil", "H2O", "CO2", "O2", "H2O2", "H2O", R.drawable.w700_agua_mineral),
            Pregunta("¿Autor del Quijote?", "Literatura", "Facil", "Cervantes", "Quevedo", "Lope", "Góngora", "Cervantes", R.drawable.quijote),
            Pregunta("¿Campeón mundial fútbol 2010?", "Deportes", "Facil", "Brasil", "Alemania", "España", "Italia", "España", R.drawable.mundial),
            Pregunta("¿Rey de los dioses griegos?", "Mitología", "Facil", "Zeus", "Hades", "Poseidón", "Ares", "Zeus", R.drawable.dioses_griegos),
            Pregunta("¿Cuántos días tiene una semana?", "General", "Facil", "5", "6", "7", "8", "7", R.drawable.dias_semana),
            Pregunta("¿Color de las esmeraldas?", "Ciencia", "Facil", "Rojo", "Azul", "Verde", "Amarillo", "Verde", R.drawable.esmeralda_color),
            Pregunta("¿Idioma oficial de Brasil?", "Geografía", "Facil", "Español", "Portugués", "Francés", "Inglés", "Portugués", R.drawable.idioma_brasil),
            Pregunta("¿Instrumento con teclas blancas y negras?", "Música", "Facil", "Guitarra", "Violín", "Piano", "Flauta", "Piano", R.drawable.piano),
            Pregunta("¿Cuál es el planeta rojo?", "Ciencia", "Facil", "Venus", "Marte", "Júpiter", "Saturno", "Marte", R.drawable.marte),

            Pregunta("¿Quién pintó la Mona Lisa?", "Arte", "Medio", "Picasso", "Van Gogh", "Da Vinci", "Dalí", "Da Vinci", R.drawable.mona_lisa),
            Pregunta("¿Planeta más grande?", "Ciencia", "Medio", "Tierra", "Marte", "Júpiter", "Saturno", "Júpiter", R.drawable.planeta_grande),
            Pregunta("¿Año descubrimiento América?", "Historia", "Medio", "1492", "1500", "1485", "1992", "1492", R.drawable.mapa_america),
            Pregunta("¿Moneda de Japón?", "Economía", "Medio", "Yuan", "Won", "Yen", "Dólar", "Yen", R.drawable.yen_japones),
            Pregunta("¿Hueso más largo del cuerpo?", "Anatomía", "Medio", "Fémur", "Tibia", "Húmero", "Radio", "Fémur", R.drawable.hueso_largo),
            Pregunta("¿Capital de Italia?", "Geografía", "Medio", "Venecia", "Milán", "Roma", "Nápoles", "Roma", R.drawable.italia_capital),
            Pregunta("¿Símbolo químico del Oxígeno?", "Química", "Medio", "Ox", "O", "On", "Oxg", "O", R.drawable.oxigeno),
            Pregunta("¿Pintor del Guernica?", "Arte", "Medio", "Dalí", "Miró", "Picasso", "Velázquez", "Picasso", R.drawable.guernica),
            Pregunta("¿Continente donde está Egipto?", "Geografía", "Medio", "Asia", "Europa", "África", "América", "África", R.drawable.egipto),
            Pregunta("¿Moneda del Reino Unido?", "Economía", "Medio", "Euro", "Dólar", "Libra", "Franco", "Libra", R.drawable.dinero_uk),

            Pregunta("¿Elemento químico Au?", "Química", "Dificil", "Plata", "Oro", "Cobre", "Aluminio", "Oro", R.drawable.elemento_oro),
            Pregunta("¿Velocidad de la luz?", "Física", "Dificil", "300.000 km/s", "150.000 km/s", "1000 km/s", "Mach 1", "300.000 km/s", R.drawable.velocidad_luz),
            Pregunta("¿Elemento quimico Fe?", "Quimica", "Dificil", "Fluor", "Hierro", "Arsenico", "Bismuto", "Hierro", R.drawable.elemento_hierro),
            Pregunta("¿Que significa ADN?", "Biologia", "Dificil", "Ácido desoxirribonucleico", "Ácido dibonucleico", "Ajedrez Dominado por Nutrias", "Archivo de Nombres Olvidados", "Ácido desoxirribonucleico", R.drawable.adn),
            Pregunta("¿En que año se creo la polvora?", "Historia", "Dificil", "1205", "1203", "1201", "1200", "1200", R.drawable.polvora),
            Pregunta("¿Año de la Revolución Francesa?", "Historia", "Dificil", "1776", "1789", "1812", "1492", "1789", R.drawable.revolucion_francesa),
            Pregunta("¿Número atómico del Carbono?", "Química", "Dificil", "6", "8", "12", "14", "6", R.drawable.numero_carbono),
            Pregunta("¿Autor de 'Cien años de soledad'?", "Literatura", "Dificil", "Borges", "Cortázar", "García Márquez", "Vargas Llosa", "García Márquez", R.drawable.cien_anos),
            Pregunta("¿Capital de Australia?", "Geografía", "Dificil", "Sídney", "Melbourne", "Canberra", "Perth", "Canberra", R.drawable.capital_australia),
            Pregunta("¿Primer hombre en la Luna?", "Historia", "Dificil", "Gagarin", "Armstrong", "Aldrin", "Collins", "Armstrong", R.drawable.neil_armstrong),
            Pregunta("¿Diosa romana del amor?", "Mitología", "Dificil", "Venus", "Atenea", "Hera", "Diana", "Venus", R.drawable.diosa_amor),
            Pregunta("¿País más grande del mundo?", "Geografía", "Dificil", "China", "EEUU", "Rusia", "Canadá", "Rusia", R.drawable.pais_grande),
            Pregunta("¿Metal líquido a temperatura ambiente?", "Química", "Dificil", "Hierro", "Mercurio", "Plomo", "Aluminio", "Mercurio", R.drawable.mercurio),
            Pregunta("¿Año caída Muro de Berlín?", "Historia", "Dificil", "1987", "1989", "1991", "1993", "1989", R.drawable.muro_berlin),
            Pregunta("¿Quién escribió 'Hamlet'?", "Literatura", "Dificil", "Dickens", "Shakespeare", "Joyce", "Orwell", "Shakespeare", R.drawable.hamlet)
        )
    }
}