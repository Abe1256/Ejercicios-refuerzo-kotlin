/*Escribir un programa que pida al usuario una palabra y muestre por pantalla el número de veces que contiene cada vocal.*/
fun main() {
    print("Ingresa una palabra: ")
    val palabra = readLine()?.trim()?.lowercase() ?: ""

    val conteoVocales = contarVocales(palabra)

    println("Conteo de vocales en \"$palabra\":")
    conteoVocales.forEach { (vocal, cantidad) ->
        println("La vocal '$vocal' aparece $cantidad vez${if (cantidad != 1) "es" else ""}.")
    }
}

fun contarVocales(palabra: String): Map<Char, Int> {
    val vocales = listOf('a', 'e', 'i', 'o', 'u')
    val conteo = mutableMapOf<Char, Int>()

    // Inicializa el conteo de cada vocal en 0
    vocales.forEach { conteo[it] = 0 }

    // Cuenta las ocurrencias de cada vocal
    palabra.forEach { letra ->
        if (letra in vocales) {
            conteo[letra] = conteo[letra]!! + 1
        }
    }

    return conteo
}
