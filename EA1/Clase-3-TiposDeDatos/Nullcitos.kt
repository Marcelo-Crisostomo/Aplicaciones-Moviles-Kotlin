fun main(){
    //Val null
    val apellido: String? = "Crisóstomo Carrasco"
    //1) Safe call = Llamada segura -> solo si no es null
    println("1) Safe call")
    println(apellido?.length)
    //Como apellido es null = imprimir null
    //2 Elvis Operator (?:) -> Asigna un valor por defecto = 0
    println("2) Elvis")
    val longitud = apellido?.length ?: 0
    println("longitud con Elvis: $longitud")
    //3 NNA Non NUll Assertion  (!!) -> asegurando que este dato no va a ser null
    // NPE NullPointException
    // try catch
    println("3)NNA !!")
    try{
        println(apellido!!.length)//Asegurando que el dato no es null -> NPE
    }catch(e: NullPointerException){
        println("Error el apellido es null y causó este NPE NullPointerException")
    }
}