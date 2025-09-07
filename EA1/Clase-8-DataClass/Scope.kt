//importar las corrutinas
import kotlinx.coroutines.*;

fun main(){

    println("1- preparar la masa de la pizza")//Ejecutar en el hilo principal//default

    //GoblalScope= es un ambito global que permite lanzar corrutinas que viven durante toda la ejecución del progama.
    //Se crea un nuevo hilo de ejecución de manera paralela
    GlobalScope.launch{

        delay(2000L) //simulando el tiempo que la pizza en el horno

        println("La pizza está lista para sacrla del horno")

    }

    //optimizo tiempo mientras la pizza se cocina
    println("Preparando la mesa y una ensalida")

    //le doy el tiempo para que pizza se cocine
    Thread.sleep(3000L)
    println("me siento a comer la pizzita")




}