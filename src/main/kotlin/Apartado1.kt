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
    repeat(capas){
        repeat(edad){
            print("@")
        }
        println()
    }
}

private fun imprimirMensaje(mensaje: String) {
    repeat(15) {
        print("¨-._.-¨")
    }
    println()
    println(mensaje)
    repeat(15) {
        print("¨-._.-¨")
    }
}

fun main() {
    imprimirMensaje("MUCHAS FELICIDADES")
    println()
    imprimirVelas(30)
    println()
    imprimirCapaSup(30)
    println()
    imprimirCapasInf(30,5)
    println()
    imprimirMensaje("MUCHAS FELICIDADES")
}