/*Escribir un programa que almacene las asignaturas de un curso (por ejemplo Matemáticas, Física, Química, Historia y Lengua) en una lista, pregunte al usuario la nota que ha sacado en cada asignatura y elimine de la lista las asignaturas aprobadas. Al final el programa debe mostrar por pantalla las asignaturas que el usuario tiene que repetir.*/
fun main() {
    val asignaturas = mutableListOf("Mates", "Física", "Química", "Historia", "Lengua")
    val aprobadas = mutableListOf<String>()

    for (asignatura in asignaturas) {
        println("Introduce tu calificación en $asignatura:")
        val nota = readLine()?.toIntOrNull() ?: 0
        if (nota >= 5) {
            aprobadas.add(asignatura)
        }
    }

    asignaturas.removeAll(aprobadas)

    if (asignaturas.isEmpty()) {
        println("No tienes asignaturas que repetir. ¡Buen trabajo!")
    } else {
        println("Debes repetir las siguientes asignaturas: $asignaturas")
    }
}
