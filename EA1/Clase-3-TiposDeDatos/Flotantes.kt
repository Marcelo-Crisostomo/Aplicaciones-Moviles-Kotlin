fun main(){

    val x: Float = 3.5F //Sufijo para declarar un valor flotante
    val y: Double = 1.2 // Double asume por defecto que es un dato de este tipo
    val suma = x + y
    val multiplicacion = x * 10
    val division = y / 0.5


    //Ejemplo de presición
    val p = 0.1 + 0.2 // imprimir 0.300000000000000000004 debido a que es un dato binario

    println("x = $x, y = $y, suma = $suma, multiplicacion = $multiplicacion, division = $division, 0.1 + 0.2 = $p")

    //Formateo usando String.format de Java
    val formateado = String.format("p=%.2f", p)//mostrar 2 decimales
    println(formateado)
}