/*Escribe un programa que pida el importe final de un artículo y calcule e imprima por pantalla el IVA que se ha pagado y el importe sin IVA (suponiendo que se ha aplicado un tipo de IVA del 10%).*/
fun pedirPrecioIVA(): Float {
    println("Introduce el precio con IVA: ")
    val precioIVA = readln().toFloat()
    return precioIVA
}

fun calcularPrecioOriginal(precioIVA:Float):Float {
    val precioOG = precioIVA / (1 + (10 / 100))
    return precioOG
}


fun main(args: Array<String>) {
    //entrada
    val precioIVA = pedirPrecioIVA()
    val precioOG: Float = calcularPrecioOriginal(precioIVA)
    //procesamiento
    val salida = calcularPrecioOriginal(precioOG)
    //salida
    println("Teniendo en cuenta que el IVA era de un 10% y el precio con IVA era $precioIVA, el precio original es de $precioOG.")
}
