fun main(){
    val letra: Char = 'a'
    val digito: Char = '7'

    val esLetra = letra.isLetter() // true
    val esDigito = digito.isDigit() // true

    val mayus = letra.uppercaseChar()// 'A'
    var cursor = 'b' //var para modificar
    cursor++

    println("letra= $letra, (esLetra= $esLetra), digito = $digito, (esdigito= $esDigito), mayus= $mayus, cursor = $cursor)")
}