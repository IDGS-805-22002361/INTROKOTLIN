import kotlin.math.PI
import kotlin.math.pow


fun areaCuadrado(lado: Double): Double = lado.pow(2)

fun areaRectangulo(base: Double, altura: Double): Double = base * altura

fun areaTriangulo(base: Double, altura: Double): Double = (base * altura) / 2

fun areaCirculo(radio: Double): Double = PI * radio.pow(2)


fun limpiarPantalla() {
    try {
        ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor()
    } catch (e: Exception) {
        repeat(20) { println() }
    }
}

fun main() {
    var opcion: Int

    do {
        println("\n--- MENÚ DE CÁLCULO DE ÁREAS ---")
        println("1. Cuadrado")
        println("2. Rectángulo")
        println("3. Triángulo")
        println("4. Círculo")
        println("5. Salir")
        print("Elija una opción: ")
        
        opcion = readln().toIntOrNull() ?: 0

        when (opcion) {
            1 -> {
                print("Ingrese el lado del cuadrado: ")
                val l = readln().toDoubleOrNull() ?: 0.0
                println("El área del cuadrado es: ${String.format("%.2f", areaCuadrado(l))}")
            }
            2 -> {
                print("Ingrese la base: ")
                val b = readln().toDoubleOrNull() ?: 0.0
                print("Ingrese la altura: ")
                val a = readln().toDoubleOrNull() ?: 0.0
                println("El área del rectángulo es: ${String.format("%.2f", areaRectangulo(b, a))}")
            }
            3 -> {
                print("Ingrese la base: ")
                val b = readln().toDoubleOrNull() ?: 0.0
                print("Ingrese la altura: ")
                val a = readln().toDoubleOrNull() ?: 0.0
                println("El área del triángulo es: ${String.format("%.2f", areaTriangulo(b, a))}")
            }
            4 -> {
                print("Ingrese el radio del círculo: ")
                val r = readln().toDoubleOrNull() ?: 0.0
                println("El área del círculo es: ${String.format("%.2f", areaCirculo(r))}")
            }
            5 -> println("Saliendo del programa...")
            else -> println("Opción no válida, intente de nuevo.")
        }
        
    } while (opcion != 5)
}