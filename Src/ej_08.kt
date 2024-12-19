/*Escribir el programa del ejercicio 1.7 usando solamente dos variables diferentes.*/
/*Aquí omitiremos la función suma y la acoplaremos a la función main*/
fun pedirNums(): Triple<Int, Int, Int> {
    println("Introduce el primer número: ")
    var num1 = readln().toInt()
    println("Introduce el segundo número: ")
    var num2 = readln().toInt()
    println("Introduce el tercer número: ")
    var num3 = readln().toInt()
    return Triple(num1, num2, num3)
}

fun main() {
    //Entrada de datos y cálculo de la suma
    val (num1, num2, num3) = pedirNums()
    val resultado = num1 + num2 + num3

    //Salida de la Solución
    println("La suma de $num1, $num2 y $num3 es:")
    println("$num1 + $num2 + $num3 = $resultado")
}
