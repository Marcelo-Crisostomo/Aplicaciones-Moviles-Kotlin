fun main(){
    val edadNoNula: Int = 20 // es un entero y dato primitivo = no puede ser null
    val edadNula: Int? = null // Puede ser un null ?
    //JVM null = lo convierte a un objeto, deja de ser un dato primitivo = Box o caja
    //primitvos, son Int, Boolean, Double

    //Llamada segura
    val dobleEdad = edadNula?.times(2)// times = *

    //Elvis = provee un valor por defecto  cuando el lado izquierdo es null
    val edadEfectiva = edadNula ?: 18 //18 sería el valor usado

    print("edadNoNula= $edadNoNula, dobleEdad= $dobleEdad, edadEfectiva = $edadEfectiva")
}