/*Escribir un programa que muestre por pantalla el resultado de la siguiente operación aritmética: (3 + 2 / 2 * 5)^2*/
import kotlin.math.pow

fun main() {
    val resultado = ((3.0 + 2) / (2 * 5)).pow(2) // Usamos 3.0 para manejar decimales
    println("El resultado de la operación ((3 + 2) / (2 * 5))^2 es $resultado")
}
