private fun imprimirVelas(edad: Int) {
    repeat(edad) {
        print("'")
    }
    println()
    repeat(edad) {
        print("|")
    }
}

private fun imprimirCapaSup(edad: Int) {
    repeat(edad) {
        print("=")
    }
}

private fun imprimirCapasInf(edad: Int, capas: Int) {
    repeat(capas) {
        repeat(edad) {
            print("@")
        }
        println()
    }
}

private fun imprimirMensaje(mensaje: String, edad: Int) {
    repeat(edad) {
        print("¨-._.-¨")
    }
    println()
    repeat((edad / 2) - (mensaje.length / 2)) { print(' ') }
    println(mensaje)
    repeat(edad) {
        print("¨-._.-¨")
    }
}

fun main() {
    println("Introduzca la edad de la persona que felicitamos.")
    val edad = readLine()!!.toInt()
    println("Introduzca las capas que tendrá el pastel.")
    val capas = readLine()!!.toInt()
    println("Introduzca el mensaje.")
    val mensaje = readLine().toString()
    imprimirMensaje(mensaje, edad)
    println()
    imprimirVelas(edad)
    println()
    imprimirCapaSup(edad)
    println()
    imprimirCapasInf(edad, capas)
    println()
    imprimirMensaje(mensaje, edad)
}