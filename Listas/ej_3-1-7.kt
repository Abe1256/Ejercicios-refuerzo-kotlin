/*Escribir un programa que almacene el abecedario en una lista, elimine de la lista las letras que ocupen posiciones múltiplos de 3, y muestre por pantalla la lista resultante.*/
fun main() {
    val abecedario = ('a'..'z').toMutableList()

    // Recorremos la lista desde el final hacia el principio
    for (i in abecedario.size - 1 downTo 0) {
        if ((i + 1) % 3 == 0) {
            abecedario.removeAt(i) // i + 1 para que las posiciones sean base
        }
    }

    // Lista resultante
    println(abecedario)
}
