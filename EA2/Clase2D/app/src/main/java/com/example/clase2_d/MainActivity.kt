package com.example.clase2_d
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clase2_d.ui.theme.Clase2DTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Clase2DTheme {
                LoginScreen()
            }
        }
    }
}

@Composable
fun LoginScreen(){
    //Estados o variables de mi app
    var usuario by remember { mutableStateOf("") }
    var clave by remember { mutableStateOf("") }
    var mensaje by remember {mutableStateOf("")}

    Column (
        modifier = Modifier
            .fillMaxSize()//Ocupa toda la pantalla
            .background(Color(0xFFEDF2F7))//Gris claro 0xFF_______
            .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally, //centrado horizontal
        verticalArrangement = Arrangement.Center //centrado vertical
    ){
        //LOGO
        Image(
            painter = painterResource(id= R.drawable.logo_duoc),//Cargando el logo
            contentDescription = "Logotipo oficial de DUOC UC",
            modifier = Modifier
                .height(100.dp)
                .padding(bottom= 32.dp)
        )

        //Campos de user
        TextField(
            value = usuario,
            onValueChange =  {usuario = it},//actualiza el estado
            label = {Text("Usuario")},
            singleLine = true

        )

        Spacer(modifier = Modifier.height(20.dp))

        //Campos de pass
        TextField(
            value = clave,
            onValueChange =  {clave = it},//actualiza el estado
            label = {Text("Contraseña")},
            singleLine = true,
            visualTransformation = PasswordVisualTransformation()//Ocultamos caracteres

        )

        Spacer(modifier = Modifier.height(20.dp))

        //BTN login
        Button(onClick = {
            if(usuario== "admin" && clave == "colocolo91") {
                mensaje = "Bienvenido, $usuario"
            }else{
                mensaje = "Usuario o contraseña incorrecta"
            }

        },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFFFc107), //color fondo
                contentColor = Color(0xFF000000)  //color texto
            )
        )

        { Text("Ingresar a AVA")}
            //
        Spacer(modifier = Modifier.height(20.dp))

        //Validar el mensaje
        if(mensaje.isNotEmpty()){
            Text(
                text = mensaje,
                fontSize = 18.sp,
                color = if(mensaje.contains("Bienvenido,"))Color(0xFF2E7D32) else Color(0xFFC62828)
            )
        }


    }

}


@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    Clase2DTheme {
        LoginScreen()
    }
}