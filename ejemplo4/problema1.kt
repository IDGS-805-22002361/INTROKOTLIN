fun main() {
    var diametro: Double
    
    do {
        print("Ingrese el diámetro de la tubería (debe ser mayor a 0): ")
        diametro = readLine()?.toDoubleOrNull() ?: 0.0
        
        if (diametro <= 0) {
            println("Valor no válido. Intente de nuevo.")
        }
    } while (diametro <= 0)
    
    println("Valor aceptado: $diametro")
}