fun main(){

    val mayorDeEdad = true
    val tienePermiso = false

    val puedeEntrar = mayorDeEdad && tienePermiso //And true && false = false
    val entrarPorExcepcion = mayorDeEdad || tienePermiso //Or true || false =  true
    val negacion = mayorDeEdad // NOT !true = false

    println("puede entrar = $puedeEntrar, entrar por excepción = $entrarPorExcepcion, negación = $negacion")


}