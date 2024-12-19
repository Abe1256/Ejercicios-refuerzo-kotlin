/*Escribe un programa que le pida al usuario una temperatura en grados Celsius, la convierta a grados Fahrenheit e imprima por pantalla la temperatura convertida.*/
fun pedirCelsius(): Float {
    println("Introduce la temperatura en grados Celsius: ")
    var Celsius = readln().toFloat()
    return Celsius
}

fun TemperaturaFahrenheit(Celsius:Float):Double {
    val Fahrenheit = Celsius * 1.8 + 32
    return Fahrenheit
}


fun main(args: Array<String>) {
    //entrada
    var Celsius: Float = pedirCelsius()
    val Fahrenheit: Double = TemperaturaFahrenheit(Celsius)
    //procesamiento
    val salida = TemperaturaFahrenheit(Celsius)
    //salida
    println("$Celsius ºC son $Fahrenheit ºF")
}
