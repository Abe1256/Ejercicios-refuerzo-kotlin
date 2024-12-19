/*Escribe un programa para pedirle al usuario las horas de trabajo y el precio por hora y calcule el importe total del servicio.*/
fun pedirDatos(): Pair<Int, Int> {
    println("Introduce las horas: ")
    var horas = readln().toInt()
    println("Introduce el precio por hora: ")
    var precio = readln().toInt()
    return Pair(horas, precio)
}

fun importeServicio(horasTrabajo:Int, precioHora: Int):Int {
    var importe = horasTrabajo * precioHora
    return importe
}


fun main(args: Array<String>) {
    //entrada
    var (horas:Int, precio:Int) = pedirDatos()
    //procesamiento
    val salida = importeServicio(horas, precio)
    //salida
    println("El importe total es $salida€")
}
