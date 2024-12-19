/*Escribe un programa que pida el importe sin IVA de un artículo y el tipo de IVA a aplicar y calcule e imprima por pantalla el precio final del artículo.*/
fun pedirPrecio(): Float {
    println("Introduce el precio del producto: ")
    var precio = readln().toFloat()
    return precio
}

fun CalcularPrecioIVA(precio:Float):Float {
    val precioIVA = precio + precio * 21 / 100
    return precioIVA
}


fun main(args: Array<String>) {
    //entrada
    var precio: Float = pedirPrecio()
    val precioIVA: Float = CalcularPrecioIVA(precio)
    //procesamiento
    val salida = CalcularPrecioIVA(precioIVA)
    //salida
    println("El precio total es: $precio€ de precio base más 21% de IVA, en total $precioIVA€.")
}
