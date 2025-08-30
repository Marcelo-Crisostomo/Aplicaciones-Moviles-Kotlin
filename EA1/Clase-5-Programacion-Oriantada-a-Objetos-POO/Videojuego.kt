class Videojuego (
    private val nombre: String,
    private val genero: String,
    private val anio: Int,
    private val desarrollador:String,
    private val precio: Int )
    : Producto(){
        override fun descripcion(): String {
            return "🎮 $nombre ( $genero, $anio) - $desarrollador -  $$precio CLP"
        }
    override fun precioFinal(): Int {
        return (precio * 1.19).toInt()

    }
    fun esRetro(): Boolean{
        return anio < 2010
    }

    }