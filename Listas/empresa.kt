fun mostrarMenu() {
    println(
        """
        Menú de opciones:
        (1) Añadir cliente
        (2) Eliminar cliente
        (3) Mostrar cliente
        (4) Listar clientes
        (5) Listar clientes preferentes
        (6) Terminar
        Elige una opción:
        """.trimIndent()
    )
}

fun añadirCliente(clientes: MutableMap<String, MutableMap<String, Any>>) {
    println("\n--- Añadir cliente ---")
    print("Introduce NIF del cliente: ")
    val nif = readLine().orEmpty()
    print("Introduce el nombre del cliente: ")
    val nombre = readLine().orEmpty()
    print("Introduce la dirección del cliente: ")
    val direccion = readLine().orEmpty()
    print("Introduce el teléfono del cliente: ")
    val telefono = readLine().orEmpty()
    print("Introduce el correo electrónico del cliente: ")
    val email = readLine().orEmpty()
    print("¿Es un cliente preferente (S/N)? ")
    val preferente = readLine().orEmpty().equals("S", ignoreCase = true)

    clientes[nif] = mutableMapOf(
        "nombre" to nombre,
        "dirección" to direccion,
        "teléfono" to telefono,
        "email" to email,
        "preferente" to preferente
    )
    println("Cliente añadido con éxito.")
}

fun eliminarCliente(clientes: MutableMap<String, MutableMap<String, Any>>) {
    println("\n--- Eliminar cliente ---")
    print("Introduce NIF del cliente: ")
    val nif = readLine().orEmpty()
    if (clientes.remove(nif) != null) {
        println("Cliente eliminado con éxito.")
    } else {
        println("No existe un cliente con el NIF: $nif.")
    }
}

fun mostrarCliente(clientes: MutableMap<String, MutableMap<String, Any>>) {
    println("\n--- Mostrar cliente ---")
    print("Introduce NIF del cliente: ")
    val nif = readLine().orEmpty()
    val cliente = clientes[nif]
    if (cliente != null) {
        println("Información del cliente:")
        println("NIF: $nif")
        cliente.forEach { (clave, valor) ->
            println("${clave.replaceFirstChar { it.uppercase() }}: $valor")
        }
    } else {
        println("No existe un cliente con el NIF: $nif.")
    }
}

fun listarClientes(clientes: MutableMap<String, MutableMap<String, Any>>) {
    println("\n--- Lista de clientes ---")
    if (clientes.isEmpty()) {
        println("No hay clientes registrados.")
    } else {
        clientes.forEach { (nif, datos) ->
            println("$nif: ${datos["nombre"]}")
        }
    }
}

fun listarClientesPreferentes(clientes: MutableMap<String, MutableMap<String, Any>>) {
    println("\n--- Lista de clientes preferentes ---")
    val preferentes = clientes.filter { it.value["preferente"] == true }
    if (preferentes.isEmpty()) {
        println("No hay clientes preferentes.")
    } else {
        preferentes.forEach { (nif, datos) ->
            println("$nif: ${datos["nombre"]}")
        }
    }
}

fun main() {
    val clientes = mutableMapOf<String, MutableMap<String, Any>>()
    var opcion: String

    do {
        mostrarMenu()
        opcion = readLine().orEmpty()

        when (opcion) {
            "1" -> añadirCliente(clientes)
            "2" -> eliminarCliente(clientes)
            "3" -> mostrarCliente(clientes)
            "4" -> listarClientes(clientes)
            "5" -> listarClientesPreferentes(clientes)
            "6" -> println("\nSaliendo del programa...")
            else -> println("\nOpción no válida. Por favor, elige una opción del menú.")
        }
    } while (opcion != "6")
}
