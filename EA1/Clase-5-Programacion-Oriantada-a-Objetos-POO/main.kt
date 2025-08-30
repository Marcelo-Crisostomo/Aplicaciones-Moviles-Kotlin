fun main(){
    // Creamos videojuegos
    val fifa = Videojuego("FIFA 25", "Deportes", 2025, "EA Sports", 45000)      // Juego nuevo
    val gta = Videojuego("GTA VI", "Acción", 2025, "Rockstar", 60000)           // Juego caro
    val pes2010 = Videojuego("PES 2010", "Deportes", 2009, "Konami", 15000)     // Juego retro

    // Creamos consolas
    val ps5 = Consola("PlayStation 5", "Sony", 500000, 4)    // Consola con stock
    val nintendo = Consola("Nintendo Switch", "Nintendo", 350000, 0) // Sin stock

    // Creamos usuario
    val usuario = Usuario("Marcelo", 30)

    // Agregamos videojuegos a su cuenta
    usuario.agregarVideojuego(fifa)
    usuario.agregarVideojuego(gta)
    usuario.agregarVideojuego(pes2010)

    // Mostramos resumen de usuario
    println(usuario.obtenerResumen())

    // Filtrar juegos por género
    println("\n🎯 Juegos de deportes:")
    usuario.mostrarFavoritosPorGenero("Deportes").forEach {
        println("- ${it.descripcion()}")
    }

    // Lista polimórfica de productos disponibles en tienda
    val productos: List<Producto> = listOf(fifa, gta, pes2010, ps5, nintendo)

    println("\n🛒 Catálogo de productos en PuertoGames:")
    productos.forEach {
        println("- ${it.descripcion()} | Precio final con impuesto o descuento: $${it.precioFinal()}")
    }

    // Verificamos disponibilidad de consolas
    println("\n📦 Estado de stock:")
    if (ps5.tieneStock()) println("✅ ${ps5.descripcion()} está disponible.")
    if (!nintendo.tieneStock()) println("❌ ${nintendo.descripcion()} está agotada.")

    // Mostrar si algún juego es retro
    println("\n🕰️ Juegos retro:")
    productos.filterIsInstance<Videojuego>().filter { it.esRetro() }.forEach {
        println("- ${it.descripcion()}")
    }
}