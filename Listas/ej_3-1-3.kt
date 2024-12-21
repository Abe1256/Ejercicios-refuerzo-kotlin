/*Escribir un programa que almacene las asignaturas de un curso (por ejemplo Matemáticas, Física, Química, Historia y Lengua) en una lista, pregunte al usuario la nota que ha sacado en cada asignatura, y después las muestre por pantalla con el mensaje En <asignatura> has sacado <nota> donde <asignatura> es cada una des las asignaturas de la lista y <nota> cada una de las correspondientes notas introducidas por el usuario.*/
fun main() {
    val asignaturas = listOf("Mates", "Física", "Química", "Historia", "Lengua")
    val notas = mutableListOf<Int>()

    for (asignatura in asignaturas) {
        println("Introduce tu calificación en $asignatura")
        val nota = readLine()?.toIntOrNull() ?:0
        notas.add(nota)
    }
    println("Tus calificaciones son:")
    for (i in asignaturas.indices) {
        println("En ${asignaturas[i]} has sacado un ${notas[i]}")
    }
}
