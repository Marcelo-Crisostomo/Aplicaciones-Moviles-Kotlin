//Comentario Kotlin
//Variables

fun main(){
    // Val no permite cambiar su valor //Const
    val nombre: String = "Kotlin" // String

    val version = "2.0"

    //Variable que si puede cambiar su valor
    var year = 2025
    year = year + 1

    //Literale numéricos con guines bajos para mejorar legibilidad
    val grande = 1_000_000

    // Impresión de nuestra variables
    println("Hola $nombre, $version, $year, cifra grande= $grande")

}