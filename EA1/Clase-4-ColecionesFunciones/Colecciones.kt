fun main(){
    //LIST admite datos duplicados, conserva el orden
    val nombres: List<String> = listOf("Francisco","Javiera", "Eliecer", "Francisco")
    println("Lista de nombres: $nombres")
    //Set: no admite repetidos
    val nombresunicos: Set<String> = nombres.toSet()
    println("Set únicos: $nombresunicos")
    //MAP clave valor ()JSON // no puede tener claves repetidas
    //Nombre : Curso
    val cursos: Map<String, String> = mapOf(
        "Benjamín" to "Aplicaciones Móviles",
        "Eliecer" to "Full Stack II",
        "Eliecer" to "Aplicaiones móviles"
    )
    println("Map: $cursos")
    //Acceso a un valor por la clave
    println("Curso de Benjamín: ${cursos["Benjamín"]}")
    println("Curso de Eliecer: ${cursos["Eliecer"]}")
}