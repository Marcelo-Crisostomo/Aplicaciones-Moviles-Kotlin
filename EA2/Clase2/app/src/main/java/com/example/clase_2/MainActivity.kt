package com.example.clase_2

import android.os.Bundle // Manejo del ciclo de vida
import androidx.activity.ComponentActivity // Actividad principal
import androidx.activity.compose.setContent // Para definir UI con Compose
import androidx.compose.foundation.Image // Para mostrar imágenes
import androidx.compose.foundation.background // Para aplicar color de fondo
import androidx.compose.foundation.layout.* // Column, Spacer, etc.
import androidx.compose.material3.* // Componentes Material 3
import androidx.compose.runtime.* // Estados
import androidx.compose.ui.Alignment // Alineación
import androidx.compose.ui.Modifier // Modificadores para diseño
import androidx.compose.ui.graphics.Color // Colores personalizados
import androidx.compose.ui.res.painterResource // Para cargar imágenes
import androidx.compose.ui.text.input.PasswordVisualTransformation // Ocultar contraseña
import androidx.compose.ui.tooling.preview.Preview // Vista previa
import androidx.compose.ui.unit.dp // Unidades de medida
import androidx.compose.ui.unit.sp // Tamaño de texto
import com.example.clase_2.ui.theme.Clase2Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Clase2Theme{
                LoginScreen() // Llamamos a la pantalla de login
            }
        }
    }
}

@Composable
fun LoginScreen() {
    // ---------- ESTADOS ----------
    var usuario by remember { mutableStateOf("") } // Estado para el usuario
    var clave by remember { mutableStateOf("") } // Estado para la contraseña
    var mensaje by remember { mutableStateOf("") } // Resultado del login

    // ---------- LAYOUT PRINCIPAL ----------
    Column(
        modifier = Modifier
            .fillMaxSize() // Ocupa toda la pantalla
            .background(Color(0xFFEDF2F7)) // Fondo gris claro
            .padding(24.dp), // Margen interno general
        horizontalAlignment = Alignment.CenterHorizontally, // Centrado horizontal
        verticalArrangement = Arrangement.Center // Centrado vertical
    ) {
        // ---------- LOGO ----------
        Image(
            painter = painterResource(id = R.drawable.logo_duoc), // Carga el logo
            contentDescription = "Logo", // Descripción accesible
            modifier = Modifier
                .height(100.dp) // Alto del logo
                .padding(bottom = 32.dp) // Espacio debajo del logo
        )

        // ---------- CAMPO USUARIO ----------
        TextField(
            value = usuario,
            onValueChange = { usuario = it }, // Actualiza estado
            label = { Text("Usuario") }, // Etiqueta
            singleLine = true // Solo una línea
        )

        Spacer(modifier = Modifier.height(12.dp)) // Espacio entre campos

        // ---------- CAMPO CONTRASEÑA ----------
        TextField(
            value = clave,
            onValueChange = { clave = it },
            label = { Text("Contraseña") },
            singleLine = true,
            visualTransformation = PasswordVisualTransformation() // Oculta caracteres
        )

        Spacer(modifier = Modifier.height(20.dp))

        // ---------- BOTÓN DE LOGIN ----------
        Button(onClick = {
            if (usuario == "admin" && clave == "1234") { // Validación simple
                mensaje = "Bienvenido, $usuario ✅"
            } else {
                mensaje = "Usuario o contraseña incorrecta ❌"
            }

        },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFFFC107),
                contentColor = Color(0XFF000000)
            )
            )

        {
            Text("Ingresar")
        }

        Spacer(modifier = Modifier.height(20.dp))

        // ---------- MENSAJE DE VALIDACIÓN ----------
        if (mensaje.isNotEmpty()) {
            Text(
                text = mensaje,
                fontSize = 18.sp,
                color = if (mensaje.contains("✅")) Color(0xFF2E7D32) else Color(0xFFC62828)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    Clase2Theme{
        LoginScreen()
    }
}
