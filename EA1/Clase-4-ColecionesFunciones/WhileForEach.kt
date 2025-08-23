fun main(){

    val edades: List<Int> = listOf(18, 20, 30 ,16, 22, 20)

    var i = 0
    while(i < edades.size){  //mientras el valor sea menor que el tamaño de la lista
        println("Whike -> edad [${i}]= ${edades[i]}") //imprimimos por indice
        i++ //incrementamos el contador
    }


    //ForEach
    edades.forEach{ e -> println("ForEach -> Edad: $e")

    }

}