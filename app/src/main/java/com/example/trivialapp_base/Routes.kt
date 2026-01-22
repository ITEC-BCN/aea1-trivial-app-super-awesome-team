package com.example.trivialapp_base

sealed class Routes(val route: String) {
    object MenuScreen:Routes("pantalla1")
    object GameScreen:Routes("pantalla2")
    object ResultScreen:Routes("pantalla3")

}