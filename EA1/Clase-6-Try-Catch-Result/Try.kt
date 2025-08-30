fun main(){

    //TRY CATCH= Errores o excepciones, para que el programa no se detenga

    println("Bienvenida a PuertoGames móvil")
    println("Ingrese monto a recargar")

    try {
        //leer info del usuario en un input
        val entrada = readLine()

        //detectar si un valor
        //Convertir de string = int o lanzamos una excepción
        val monto = entrada?.toInt() ?: throw Exception("Ingresa un dato, la entrada está vacía")

        // números negativos : recibe un argumento no válido
        if (monto <=0){
            throw IllegalArgumentException("El monto de la recarga debe ser mayor a 0")
        }
        println("La recar de $monto CLP fue exitosa")
    }catch(e: NumberFormatException){
        println("Ingresa un número válido")
        //en caso de que sea negativo
    }catch (e: IllegalArgumentException) {
        println("Error de lógica ${e.message}")
    }//Cubro cualquier error no anticipado
    catch (e: Exception){
        println("Error inesperado: ${e.message}")
    }//se ejecuta si o si hay o no haya un error
    finally {
        println("Gracias por recargar en puerto Games móvil")
    }


}