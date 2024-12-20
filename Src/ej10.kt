/*Escribir un programa que lea un entero positivo, n, introducido por el usuario y después muestre en pantalla la suma de todos los enteros desde 1 hasta n. La suma de los n primeros enteros positivos puede ser calculada de la siguiente forma:*/
fun main() {
    // Leer el número entero positivo introducido por el usuario
    print("Introduce un número entero positivo: ")
    val n = readlnOrNull()?.toIntOrNull()

    // Comprobar que el número es válido y positivo
    if (n != null && n > 0) {
        // Calcular la suma de los primeros n enteros positivos usando la fórmula
        val suma = (n * (n + 1)) / 2
        println("La suma de los primeros $n enteros positivos es: $suma")
    } else {
        println("Por favor, introduce un número entero positivo válido.")
    }
}
