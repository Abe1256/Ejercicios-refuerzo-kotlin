/*Escribe un programa que pida el nombre del usuario para luego darle la bienvenida.*/
fun main() {
    println("Escribe tu nombre: ")
    val nombre: String? = readlnOrNull()
    println("Hola, $nombre .")
}
