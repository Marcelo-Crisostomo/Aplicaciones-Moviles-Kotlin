import java.io.File
import java.io.FileNotFoundException

fun main(){
    println("Ingresa el nombre del archivo a leer")
    val nombreArchivo = readLine() ?: ""

    try{
        //intentar leer el archivo /puede fallar si no existe
        val contenido = File(nombreArchivo).readText()
        println("Contenido del archivo: \n $contenido")

        //Se ejecuta en caso de que el archivo no exista
    } catch (e: FileNotFoundException) {
        println("El archivo no existe")
    }//Cualquier erro inesperado
    catch (e: Exception) {
        println("Ocurrio un error inesperado: ${e.message}")
    }
}