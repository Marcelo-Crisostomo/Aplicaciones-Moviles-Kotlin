import kotlinx.coroutines.*;

fun main () = runBlocking {

    //Dispatchers = Despachador
    //CoroutineScope(Dispatchers.Default)== crea un ambito de corrutinas y lo almacena en scope
    //Ejecutar corrutinas en bloques separados = horno separados

    val scope = CoroutineScope(Dispatchers.Default)

    //llamo a la valor y lo lanzo
    //Horno 1
    scope.launch{
        delay(2000L)
        println("Postre leche asada en el horno")
    }

    scope.launch {
        delay(3000L)
        println("Plato principal: pollito asado en el horno")
    }

    println("Organizando la cocina encendiendo hornos.")



    delay(4000L)
    println("Comida lista para servir al comenzal que da propina")







}