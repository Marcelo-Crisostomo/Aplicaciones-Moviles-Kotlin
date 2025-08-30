class Usuario(
    private val nombre: String,
    private val edad: Int
){
    private val biblioteca = mutableListOf<Videojuego>()

    fun agregarVideojuego(v: Videojuego){
        biblioteca.add(v)
    }

    fun mostrarBiblioteca(): String{
        if(biblioteca.isEmpty()) return "no tienes videojuegos aún"
        return biblioteca.joinToString(separator = "\n"){
            juego -> "${juego.descripcion()}"
        }
    }
    fun mostrarFavoritosPorGenero(genero: String): List<Videojuego>{
        return biblioteca.filter { it.descripcion().contains(genero, ignoreCase = true) }
    }

    fun obtenerResumen(): String{
       // muestra el resumen del usuario + su biblioteca

        return "Usairio $nombre ($edad años)\n Juegos:\n${mostrarBiblioteca()} "
    }



}