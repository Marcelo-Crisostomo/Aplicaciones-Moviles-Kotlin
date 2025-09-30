package com.example.perfil
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.mutableStateSetOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.perfil.ui.theme.PerfilTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PerfilTheme {
                PantallaPerfil()
            }
        }
    }
}

@Composable
fun PantallaPerfil(){
    //Variables de contenido
    var nombre by remember { mutableStateOf("Marcelo Crisóstomo Carrasco") }
    var correo by remember { mutableStateOf("mar.crisostomo@profesor.duoc.cl") }
    var bio by remember { mutableStateOf("Docente e informático un poco pesado.") }
    var guardado by remember { mutableStateOf(false) }

    //Surface = Superficie = container esteroides colores, fuentes, tamaños , padding etc.
    //Contenedor
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFF3F4F6)//gris clarito
    ) {
        Column (
            modifier = Modifier.padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ){
            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = "Foto de perfil",
                modifier = Modifier.size(120.dp).clip(CircleShape).background(Color.Gray)
            )
            //GAP
            Spacer(modifier = Modifier.height(16.dp))

            Text("Mi perfil", fontSize = 24.sp, color = Color(0xFF1E88E5))

            //Línea visible
            HorizontalDivider(modifier = Modifier.padding(vertical = 16.dp))

            //Campos con borde de línea
            OutlinedTextField(
                value = nombre,
                onValueChange = { nombre = it},
                label = { Text("Nombre ")},
                singleLine = true,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(12.dp))

            OutlinedTextField(
                value = correo,
                onValueChange = { correo = it},
                label = {Text("Correo")},
                singleLine = true,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(12.dp))

            OutlinedTextField(
                value = bio,
                onValueChange = {bio=it},
                label = {Text("Biografía")},
                modifier = Modifier.fillMaxWidth().height(100.dp)
            )
            Spacer(modifier = Modifier.height(12.dp))

            Button(
                onClick = {guardado = true},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFFC107),
                    contentColor= Color.Black
                )
            ) {
                Text("Guardar cambios del Perfil")
            }
            //Mensaje de confirmación
            if(guardado){
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Cambios guardados corectamente",
                    color = Color(0xFF2E7D32),
                    fontSize = 16.sp
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PerfilTheme {
        PantallaPerfil()

    }
}