package com.example.myapplication

import android.os.Bundle// Es para el ciclo de vida de la aplicación
import androidx.activity.ComponentActivity// Actividad base en Compose= UI
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize // Espacion , botones y elemntos de mi APP
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                FormularioSaludo()//Finción para crear
                }
            }
        }
    }
@Composable//Cada vez que hay un composable estoy creando un trozo de UI
fun FormularioSaludo(){

    //Estados o datos a capturar

    var nombre by remember {mutableStateOf("")}//Guardar el nombre del usuario
    var edad by remember { mutableStateOf("") }//Edad
    var ciudad by remember { mutableStateOf("") }//Ciudad
    var mensaje by remember { mutableStateOf("") }//Mensaje

    //Estructura principal de la aplicación
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),//Utilice la pantalla completa y agregue un padding
        horizontalAlignment = Alignment.CenterHorizontally,// Centrando horizontalmente
        verticalArrangement = Arrangement.Center///
    ){
        //Campo de nombre = TextField
        TextField(
            value = nombre, //lo relaciono con la variable
            onValueChange = {nombre = it}, //it = texto que cambia cuando el user lo escribe
            label = {Text("Ingresa tu nombrecito")}
        )
        //Barra de espacio
        Spacer(modifier= Modifier.height(12.dp))//dp = unidad de medida

        //Campo de edad

        TextField(
            value = edad,
            onValueChange = { edad = it},
            label = {Text("Ingresa tu edad")}
        )
        //Barra de espacio
        Spacer(modifier= Modifier.height(12.dp))//dp = unidad de medida

        //Campo de Ciudad
        TextField(
            value = ciudad,
            onValueChange = { ciudad = it},
            label = {Text("Ingresa tu ciudad de residencia")}
        )
        //Barra de espacio
        Spacer(modifier= Modifier.height(12.dp))//dp = unidad de medida

        //Botón del formulario
        Button(onClick = {
            if(nombre.isNotEmpty() && edad.isNotEmpty() && ciudad.isNotEmpty()){
                mensaje = "Hola, $nombre. Tienes $edad años y vives en la localidad de $ciudad."
            }else{
                mensaje = "Ingresa todos los campos, por favor."
            }
        }) {

            Text("Mostrar Saludo")//Texto del botón
        }
        Spacer(modifier= Modifier.height(12.dp))//dp = unidad de medida

        //Texto sea dinámico y aparezca después de presionar el botón
        if(mensaje.isNotEmpty()){
            Text(
                text = mensaje,
                style = MaterialTheme.typography.headlineSmall //un tamaño de letra pequeña
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun FormularioSaludoPreview(){
    MyApplicationTheme {
        FormularioSaludo()
    }
}