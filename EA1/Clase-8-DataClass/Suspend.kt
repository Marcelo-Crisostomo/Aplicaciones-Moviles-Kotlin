//Suspend= marca una función para que se pueda pausar su ejecución, no bloquea el hilo principal.
import kotlinx.coroutines.*;

suspend fun saludarConRetraso(nombre: String){

    ////Simular una espera de 2 s
    delay(2000L)

    //print
    println("Hola $nombre")
}

//se utiliza normalmente en el maín para poder ejecutar fun suspend
//RunBlocking = bloquea el hilo principal hasta que la corrutina termine
//Solo en medios de prueba o test, por que muy fácil manipularlo desde producción

fun main() = runBlocking {

    //hilo principal
    println("Preparando un saludo con retraso")

    saludarConRetraso("Marcelo Crisóstomo Carrasco")

    println("Saludo finalizado")
}