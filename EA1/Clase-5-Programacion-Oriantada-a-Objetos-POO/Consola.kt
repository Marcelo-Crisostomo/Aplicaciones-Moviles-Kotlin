class Consola(
    private val modelo:String,
    private val fabricante: String,
    private val precio: Int,
    private val stock: Int
): Producto(){
    override fun descripcion(): String {
        //Devuelve una descripción de la consola
        return "🕹️ $modelo de $fabricante - $$precio CLP ($stock unidades disponibles)"
    }

    override fun precioFinal(): Int {
        return (precio * 0.90).toInt()
    }

    fun tieneStock(): Boolean{
        return stock >0
    }


}