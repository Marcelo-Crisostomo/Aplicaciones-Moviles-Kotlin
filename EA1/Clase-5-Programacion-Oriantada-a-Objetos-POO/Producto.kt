abstract class Producto{
    abstract fun descripcion(): String
    open fun precioFinal(): Int = 0
}
