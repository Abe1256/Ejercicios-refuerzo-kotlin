/*Escribir un programa que almacene las asignaturas de un curso (por ejemplo Matemáticas, Física, Química, Historia y Lengua) en una lista y la muestre por pantalla el mensaje Yo estudio <asignatura>, donde <asignatura> sobre cada una de las asignaturas de la lista.*/
fun main () {
    val asignaturas = listOf("Mates", "Física", "Química", "Historia", "Lengua")
    for (asignatura in asignaturas) {
        println("Yo estudio $asignatura")
    }
}
