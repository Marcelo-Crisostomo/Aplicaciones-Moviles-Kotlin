fun main(){

    val edades = listOf(18, 20, 30 ,16, 22, 20)

    //Búsquedas
    val primeraMayor18 = edades.find{ it > 18}
    println("Primer dato mayor a 18:  $primeraMayor18")
    val hayMenores = edades.any { it < 18} //existe alugún menor de edad// BOOl
    println("Hay menor : $hayMenores")
    val todosAdultos = edades.all { it >=18} // BOLL
    println("Todos los mayores  : $todosAdultos")
    val edadesDobles = edades.map { it * 2}
    println("Edades x 2: $edadesDobles")
    //Filtro
    val soloAdultos = edades.filter { it >=18 }
    println("Filtrado solo adultos : $soloAdultos")
    //Reducciíon/Suma
    val suma = edades.sum()
    println("Suma de todas las edades : $suma")
    val promedio = edades.average()
    println("promedio de las edades : $promedio")
}