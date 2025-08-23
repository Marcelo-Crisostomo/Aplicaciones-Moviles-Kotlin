fun main() {
    // Variable anulable (puede ser null)
    val apellido: String? = null

    // 1) Safe Call (?.) → ejecuta solo si no es null
    println("Safe Call (?.):")
    println(apellido?.length)
    // Como apellido es null → imprime null

    // 2) Elvis Operator (?:) → asigna valor por defecto si es null
    println("\nElvis Operator (?:):")
    val longitud = apellido?.length ?: 0
    println("Longitud del apellido: $longitud")
    // Como apellido es null → usa 0

    // 3) Non-null Assertion (!!) → asegura que no es null (si lo es → NPE)
    println("\nNon-null Assertion (!!):")
    try {
        println(apellido!!.length)
        // ⚠️ Forzamos acceder, pero como es null → lanza NullPointerException
    } catch (e: NullPointerException) {
        println("Error: apellido es null y causó NullPointerException")
    }
}
