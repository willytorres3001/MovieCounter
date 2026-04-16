package com.example.moviecounter
// Cambio hecho por Desarrollador B
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun MiBoton() {
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Blue
        )
    ) {
        Text(
            text = "Mi Primer Botón",
            color = Color.White,
            fontSize = 18.sp
        )
    }
}