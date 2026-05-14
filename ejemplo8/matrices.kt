/*
    -----Suma de dos matrices 3x3 en Kotlin---
    Crear un programa que permita al usuario ingresar por teclado los valores de
    dos matrices de tamaño 3x3 y posteriormente realiza la suma de ambas matrices,
    mostrando el resultado en pantalla.

*/


fun main(parametros: Array<String>) {
    // Definición de las matrices 3x3
    val matriz1 = Array(3) { IntArray(3) }
    val matriz2 = Array(3) { IntArray(3) }
    val matrizSuma = Array(3) { IntArray(3) }

    // Carga de la primera matriz
    println("Lectura de la Matriz 1")
    for (f in 0..2) {
        for (c in 0..2) {
            print("Ingrese elemento [$f][$c]: ")
            matriz1[f][c] = readln().toInt()
        }
    }

    // Carga de la segunda matriz
    println("\nLectura de la Matriz 2")
    for (f in 0..2) {
        for (c in 0..2) {
            print("Ingrese elemento [$f][$c]: ")
            matriz2[f][c] = readln().toInt()
        }
    }

    // Proceso de suma y guardado en la tercera matriz
    for (f in 0..2) {
        for (c in 0..2) {
            matrizSuma[f][c] = matriz1[f][c] + matriz2[f][c]
        }
    }

    // Impresión del resultado
    println("\nLa suma de las dos matrices es:")
    for (f in 0..2) {
        for (c in 0..2) {
            print("${matrizSuma[f][c]} ")
        }
        println() // Salto de línea por cada fila
    }
}