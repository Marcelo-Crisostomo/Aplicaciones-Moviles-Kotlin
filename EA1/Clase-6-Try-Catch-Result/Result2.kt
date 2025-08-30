//Función simular la descarga de un archivo
fun descargarArchivo(url: String): Result<String>{
    ////si la url está vacía
    return if(url.isBlank()){
        Result.failure(Exception("La url está vacía"))
    }else if (!url.startsWith("http")){
        Result.failure(Exception("la url debe comenzar con hhtp"))
    } else{
        Result.success("Achivo descargado correctamente")
    }
}
fun main (){
    println("Bienvenido al simulador de descarga")
    println("ingresa la ur a descargar")

    val entradaUsuario = readLine() ?: ""
    val resultado = descargarArchivo(entradaUsuario)

    //manejo del resultado Result
    resultado
        .onSuccess { mensaje ->
            println("Éxito : $mensaje")
        }
    .onFailure {error ->
        println("Error al descargar : ${error.message}")
    }
    println("Fin del programa")
}