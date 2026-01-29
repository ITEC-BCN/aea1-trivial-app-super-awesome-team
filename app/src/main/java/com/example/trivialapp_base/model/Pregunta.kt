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
            Pregunta("¿Cuántos días tiene una semana?", "General", "Facil", "5", "6", "7", "8", "7"),
            Pregunta("¿Color de las esmeraldas?", "Ciencia", "Facil", "Rojo", "Azul", "Verde", "Amarillo", "Verde"),
            Pregunta("¿Idioma oficial de Brasil?", "Geografía", "Facil", "Español", "Portugués", "Francés", "Inglés", "Portugués"),
            Pregunta("¿Instrumento con teclas blancas y negras?", "Música", "Facil", "Guitarra", "Violín", "Piano", "Flauta", "Piano"),
            Pregunta("¿Cuál es el planeta rojo?", "Ciencia", "Facil", "Venus", "Marte", "Júpiter", "Saturno", "Marte"),

            Pregunta("¿Quién pintó la Mona Lisa?", "Arte", "Medio", "Picasso", "Van Gogh", "Da Vinci", "Dalí", "Da Vinci"),
            Pregunta("¿Planeta más grande?", "Ciencia", "Medio", "Tierra", "Marte", "Júpiter", "Saturno", "Júpiter"),
            Pregunta("¿Año descubrimiento América?", "Historia", "Medio", "1492", "1500", "1485", "1992", "1492"),
            Pregunta("¿Moneda de Japón?", "Economía", "Medio", "Yuan", "Won", "Yen", "Dólar", "Yen"),
            Pregunta("¿Hueso más largo del cuerpo?", "Anatomía", "Medio", "Fémur", "Tibia", "Húmero", "Radio", "Fémur"),
            Pregunta("¿Capital de Italia?", "Geografía", "Medio", "Venecia", "Milán", "Roma", "Nápoles", "Roma"),
            Pregunta("¿Símbolo químico del Oxígeno?", "Química", "Medio", "Ox", "O", "On", "Oxg", "O"),
            Pregunta("¿Pintor del Guernica?", "Arte", "Medio", "Dalí", "Miró", "Picasso", "Velázquez", "Picasso"),
            Pregunta("¿Continente donde está Egipto?", "Geografía", "Medio", "Asia", "Europa", "África", "América", "África"),
            Pregunta("¿Moneda del Reino Unido?", "Economía", "Medio", "Euro", "Dólar", "Libra", "Franco", "Libra"),

            Pregunta("¿Elemento químico Au?", "Química", "Dificil", "Plata", "Oro", "Cobre", "Aluminio", "Oro"),
            Pregunta("¿Velocidad de la luz?", "Física", "Dificil", "300.000 km/s", "150.000 km/s", "1000 km/s", "Mach 1", "300.000 km/s"),
            Pregunta("¿Elemento quimico Fe?", "Quimica", "Dificil", "Fluor", "Hierro", "Arsenico", "Bismuto", "Hierro"),
            Pregunta("¿Que significa ADN?", "Biologia", "Dificil", "Ácido desoxirribonucleico", "Ácido dibonucleico", "Ajedrez Dominado por Nutrias", "Archivo de Nombres Olvidados", "Ácido desoxirribonucleico"),
            Pregunta("¿En que año se creo la polvora?", "Historia", "Dificil", "1205", "1203", "1201", "1200", "1200"),
            Pregunta("¿Año de la Revolución Francesa?", "Historia", "Dificil", "1776", "1789", "1812", "1492", "1789"),
            Pregunta("¿Número atómico del Carbono?", "Química", "Dificil", "6", "8", "12", "14", "6"),
            Pregunta("¿Autor de 'Cien años de soledad'?", "Literatura", "Dificil", "Borges", "Cortázar", "García Márquez", "Vargas Llosa", "García Márquez"),
            Pregunta("¿Capital de Australia?", "Geografía", "Dificil", "Sídney", "Melbourne", "Canberra", "Perth", "Canberra"),
            Pregunta("¿Primer hombre en la Luna?", "Historia", "Dificil", "Gagarin", "Armstrong", "Aldrin", "Collins", "Armstrong"),
            Pregunta("¿Diosa romana del amor?", "Mitología", "Dificil", "Venus", "Atenea", "Hera", "Diana", "Venus"),
            Pregunta("¿País más grande del mundo?", "Geografía", "Dificil", "China", "EEUU", "Rusia", "Canadá", "Rusia"),
            Pregunta("¿Metal líquido a temperatura ambiente?", "Química", "Dificil", "Hierro", "Mercurio", "Plomo", "Aluminio", "Mercurio"),
            Pregunta("¿Año caída Muro de Berlín?", "Historia", "Dificil", "1987", "1989", "1991", "1993", "1989"),
            Pregunta("¿Quién escribió 'Hamlet'?", "Literatura", "Dificil", "Dickens", "Shakespeare", "Joyce", "Orwell", "Shakespeare")
        )
    }
}