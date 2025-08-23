fun main(){
    val nombre = "marcelo" //String
    val curso = "Aplicaciones móviles con Kotlin"

    //Concatenación (+) y template
    //Concatenación
    val saludo1 = "Hola" + nombre + ", bienvenido a el curso de "+ curso
    //Template
    val saludo2 = "Hola $nombre, bienvenido al curso de $curso"// Más legible, evitar cometer errores de concatenación

    //Expresiones
    val modulos = 5
    val mensaje = "Hoy veremos ${modulos*2} ejmplos de código." //5*2

    //Métodos de String
    val largo = nombre.length // longitud del texto
    val sub = nombre.substring(0,3)// Mar subcadena
    val mayus = nombre.uppercase()//M...
    val minus = nombre.lowercase()

    //RAW texto multilínea: texto organizado, JSON, HTML, SQL """""" = texto en bloque
    //

    val bloque = """
        Línea 1 = $nombre
        Línea 2 = $curso
        (Los saltos de línea se preservan en RAW)
    """.trimIndent()// eliminas espacion en blanco, trimindent indentación

    println(saludo1)
    println(saludo2)
    println(mensaje)
    println(" largo = $largo, sub = $sub, mayus = $mayus, minus= $minus")
    println(bloque)
}

