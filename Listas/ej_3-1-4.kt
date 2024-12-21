/*Escribir un programa que pregunte al usuario los números ganadores de la lotería primitiva, los almacene en una lista y los muestre por pantalla ordenados de menor a mayor.*/
fun main() {
    val numerosGanadores = mutableListOf<Int>()

    println("Introduce los números ganadores del sorteo de lotería (seis en total):")
    for (i in 1..6) {
        println("Número $i: ")
        val numero = readLine()?.toIntOrNull() ?: 0
        numerosGanadores.add(numero)
    }
    val numerosOrdenados = numerosGanadores.sorted()
    println("Los números afortunados que han ganado el sorteo de lotería, ordenados son: $numerosOrdenados")
}
