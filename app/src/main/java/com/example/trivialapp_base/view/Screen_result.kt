package com.example.trivialapp_base.view

import androidx.compose.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.trivialapp_base.R
import com.example.trivialapp_base.Routes
import com.example.trivialapp_base.viewmodel.GameViewModel

@Composable
fun ResultScreen(navController: NavController, viewModel: GameViewModel) {
    Box(
        modifier = Modifier.
        fillMaxSize(),
        contentAlignment =  Alignment.Center){


        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = if(viewModel.puntuacion <5) {
                    painterResource(R.drawable.homer_simpson)
                }else if(viewModel.puntuacion in 5..8){
                    painterResource(R.drawable.promedio)
                }else{
                    painterResource(R.drawable.cerebro_galaxia)
                },
                contentDescription = "Imatge de resultat"

            )
            Text(
                modifier = Modifier
                    .padding(bottom = 21.dp),
                text = "Your Score",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold)

            Text(
                modifier = Modifier
                    .padding(horizontal = 30.dp),
                text = "${viewModel.puntuacion}",
                fontSize = 30.sp)

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.yellow_custom),
                    contentColor = Color.Black),) {
                    Text(
                        text = "Share",
                        fontSize = 30.sp,
                    )
                    }

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {navController.navigate(Routes.MenuScreen.route)},
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.yellow_custom),
                    contentColor = Color.Black),
                ) {
                Text(
                    text = "Return to menu",
                    fontSize = 30.sp)
                }
        }

    }
}