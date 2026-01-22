package com.example.trivialapp_base.view

import android.text.Layout
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.NavController
import com.example.trivialapp_base.viewmodel.GameViewModel
import androidx.compose.*
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.colorResource
import com.example.trivialapp_base.R
import com.example.trivialapp_base.Routes

@Composable
fun MenuScreen(navController: NavController, viewModel: GameViewModel) {
    val difficulties = listOf("Facil", "Medio", "Dificil")

    var selectedDifficulty: String by remember { mutableStateOf("Selecciona la dificultad") }
    var expanded: Boolean by remember { mutableStateOf(false) }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            //val (logoRef, contentRef, btnRef) = createRefs()

            Text(
                modifier = Modifier
                    .padding(bottom = 50.dp),
                text = "Trivial Pursuit",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
            )
            Image(
                painter = painterResource(R.drawable.trivial_icon),
                contentDescription = "Logo",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .padding(bottom = 200.dp)
                    .size(200.dp),
            )

            Button(
                onClick = { expanded = true },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.yellow_custom),
                    contentColor = Color.Black),
                    modifier = Modifier
                    .size(250.dp, 60.dp)
            ) { Text(
                text = (selectedDifficulty),
                fontSize = 18.sp,
            ) }

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier
                    .width(200.dp)
            ) {
                difficulties.forEach { difficulties ->
                    DropdownMenuItem(
                        text = { Text(text = difficulties) },
                        onClick = {
                            expanded = false
                            viewModel.setDificultad(difficulties)
                            selectedDifficulty = difficulties
                        })
                }
            }

            Button(
                onClick = { navController.navigate(Routes.GameScreen.route) },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.yellow_custom),
                    contentColor = Color.Black),
                modifier = Modifier
                    .padding(30.dp)
                    .size(100.dp),
            ) {
                Icon(
                    modifier = Modifier
                        .size(50.dp),
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = "Icon Example",
                    tint = Color.Black
                )
            }
        }
    }
}