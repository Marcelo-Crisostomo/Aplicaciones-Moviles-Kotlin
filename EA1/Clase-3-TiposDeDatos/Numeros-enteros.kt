fun main(){
    //número entero
    val a: Int = 7
    val b: Int = 2
    val c: Long = 9L  ///Sufijo L = Long

    val suma = a +b
    val resta = a - b
    val prod = a * b
    val divEntera = a / b
    val mod = a % b //Residuo o módulo de una división
    // División real : Convertir al menos uno Double o Float
    val divReal = a.toDouble() / b
    var contador = 10 //var para poder modificarlo
    contador ++ // para sumar 1
   // contador -- // para restar -1
    println("suma = $suma, resta = $resta, prod = $prod, residuo = $mod, división Entera = $divEntera, división real " +
            "= $divReal, contador = $contador")


}