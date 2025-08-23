fun main(){
    val edades: List<Int> = listOf(18, 20, 30 ,16, 22, 20)

    for(i in 1..3){ //123
        println("Intento $i")
    }

    for (edad in edades){ // Recorrer cada elemento de la lista
        println("Edad: $edad" )
    }
}