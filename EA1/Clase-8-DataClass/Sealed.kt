/**Sealed class = es una clase sellada y se usa cuando quieres contrrolar todos los tipos de datos
que puede tener una variable*/

//Es decir solo se pueden utilizar o heredar dentro del mismo archivo

//se declara e indicamos que aquí parte la jerarqiia cerrada
/*todo debe estar declarado dentro del mismo archivo*/
sealed class Resultado

data class Exito(val mensaje: String): Resultado()//positivo

data class Error(val mensaje: String): Resultado()//negativo

//Función que valide el resultado y muestre un mensaje de error o positivo
fun mostrarMensaje(resultado: Resultado){
    //utilizar when para evaluar el tipo de resultado
    when(resultado){
        //-> lambda = anónimas= no tienen nombre y automaticas
        is Exito -> println("${resultado.mensaje}") //exíto
        is Error -> println("${resultado.mensaje}") //error
    }
}
fun main(){
    val r1 : Resultado = Exito("Acceso correcto puedes pasar al dashboard")
    val r2 : Resultado = Error("Acceso incorrecto, vuelve a intentarlo")
    println(r1)
    println(r2)
}
