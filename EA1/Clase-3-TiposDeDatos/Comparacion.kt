fun main() {
    val a: Int? = 1000
    val b: Int? = 1000 //caja

    println(a==b)//true por es el mismo valor
    println(a===b)// false = compara la procedencia del valor o si vienen de la misma caja

    val s1 = "kotlin"
    val s2 = "kotlin"
    println(s1==s2)//true
    println(s1===s2)//true no realiza la diferencia, por el tipo de dato

}