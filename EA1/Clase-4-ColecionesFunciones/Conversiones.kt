fun main(){
    //Conversiones: de tipos de datos
    val textoNumero = "123"//  String que representa a unm entero
    val n1 = textoNumero.toInt() //Convierte a un Int
    val n2 = textoNumero.toDouble()// convierte a un Double o decimal
    val n3 =42.toString()//42 = "42"

    val peligro = "abc" //no es número válido
    //Boleta 21233223
    val convertidoSeguro = peligro.toIntOrNull() // null

    println("n1= $n1, n2= $n2, n3 = $n3")
    println("Convertido Seguro= $convertidoSeguro")


}