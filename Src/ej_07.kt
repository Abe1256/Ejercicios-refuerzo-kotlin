/*Escribe un programa que solicite tres números al usuario y calcule e imprima por pantalla su suma.*/
fun pedirNums(): Triple<Int, Int, Int> {
    println("Introduce el primer número: ")
    var num1 = readln().toInt()
    println("Introduce el segundo número: ")
    var num2 = readln().toInt()
    println("Introduce el tercer número: ")
    var num3 = readln().toInt()
    return Triple(num1, num2, num3)
}

fun suma(num1:Int, num2:Int, num3:Int):Int {
    var suma = num1 + num2 + num3
    return suma
}


fun main(args: Array<String>) {
    //entrada
    var (num1:Int, num2: Int, num3: Int) = pedirNums()
    //procesamiento
    val salida = suma(num1, num2, num3)
    //salida
    println("La suma de $num1, $num2 y $num3 es:")
    println("$num1 + $num2 + $num3 = $salida")
}
