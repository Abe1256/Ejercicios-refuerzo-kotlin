/*Escribir un programa que pida al usuario una palabra y muestre por pantalla si es un palíndromo.*/
fun main() {
    print("Ingresa una palabra: ")
    val palabra = readLine()?.trim() ?: ""
    
    if (esPalindromo(palabra)) {
        println("La palabra \"$palabra\" es un palíndromo.")
    } else {
        println("La palabra \"$palabra\" no es un palíndromo.")
    }
}

fun esPalindromo(palabra: String): Boolean {
    val palabraNormalizada = palabra.lowercase().replace("\\s".toRegex(), "")
    return palabraNormalizada == palabraNormalizada.reversed()
}
