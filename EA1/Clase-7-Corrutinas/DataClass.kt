//Data class = es un tipo de clase que me permite modelar datos de forma simple y ordenada

//data class solo se declara =
data class Contacto(val nombre: String, val telefono: String )

fun main(){

    val cliente1 = Contacto("Marcelo","+56923456789")//no se repite
    val cliente2 = Contacto("Panchito", "+56987654321")//se repite
    val cliente3 = Contacto("Panchito", "+56987654321")//se repite

    //ToString muestra todos los datos
    println("ToString $cliente1")

    println("Son iguales? ${cliente2 == cliente3}")//true equals
    println("Son distintos? ${cliente1 == cliente3}")//false
    //Hascode asignar un número a una caja = val o var
    println("HashCode ${cliente1.hashCode()}")//899485 // hascode


    //Uso de copy()= copiar un elemento

    val cliente4 = cliente2.copy(telefono = "+538943983489")
    println("Panchito con nuevo número $cliente4") //copy()

}