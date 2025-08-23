//Función tradicional Nombre (argumento: tipo de dato): Tipo de retorno
fun esMayorDeEdad(edad: Int): Boolean{
    return edad >= 18
}
//Funciones de una sola expresión
fun doble (n: Int) = n*2

//Función de orde superior: Recibe una segunda fución como argumento
fun aplicarALista(numeros: List<Int>, operacion: (Int)->Int): List<Int>{
    //Operación que toma un int de otra función,  retorna otro int
    return numeros.map(operacion) //Aplicando la función a cada elemento
}
fun main(){
    println(" 19 es un adulto: ${esMayorDeEdad(19)}")
    println("Doble de 7 ${doble(7)}")
    //Lambda : anónima y se ejecuta auto
    val triple: (Int)-> Int ={n -> n*3 }  //Parámetro . Resultado
    val base = listOf(1,2,3)
    val triplicados = aplicarALista(base, triple)
    println("triplicados: $triplicados")

}