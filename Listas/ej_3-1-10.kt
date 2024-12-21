/*Escribir un programa que almacene en una lista los siguientes precios: 50, 75, 46, 22, 80, 65, 8 y muestre por pantalla el menor y el mayor de los precios.*/
fun main() {
    val precios = listOf(50, 75, 46, 22, 80, 65, 8)

    val menorPrecio = precios.minOrNull() ?: 0
    val mayorPrecio = precios.maxOrNull() ?: 0

    println("Lista de precios: $precios")
    println("El menor precio es: $menorPrecio")
    println("El mayor precio es: $mayorPrecio")
}
