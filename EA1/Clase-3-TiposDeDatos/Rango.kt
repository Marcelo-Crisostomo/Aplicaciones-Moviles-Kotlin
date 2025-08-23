fun main() {
    val listaInmutable = listOf(1, 2, 3)          // No se puede cambiar
    // listaInmutable.add(4)                      // ❌ No compila

    val listaMutable = mutableListOf(1, 2, 3)     // Sí se puede cambiar
    listaMutable.add(4)                            // Agrega 4
    listaMutable[0] = 10                           // Modifica el índice 0
    println(listaMutable)                          // [10, 2, 3, 4]
}

