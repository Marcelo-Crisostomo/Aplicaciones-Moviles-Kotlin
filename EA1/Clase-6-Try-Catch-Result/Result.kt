//Función que valida un correo
fun validarEmail(email: String): Result<String>{
    //Verificar que el correo tebnga un @
    return if(email.contains("@") && email.contains(".")){
        Result.success(email)
    }else{
        //si no sucede lo solicitado en el if
        Result.failure(Exception("Formato del correo inválido"))
    }
}//fin validar email
fun main(){
    //Motramos mensaje al usuario
    println("📧 Ingrese su correo electrónico")
    //Leer si lo escribió
    val correo = readLine() ?: ""
    //llamar a fun validar
    validarEmail(correo)
        .onSuccess { println("Correo váido $it" ) }
        .onFailure { println("Error Correo inváido $it" ) }
}