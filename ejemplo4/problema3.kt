fun main() {
    val claveCorrecta = "1234"
    var intentos = 0
    val maxIntentos = 3
    var accesoConcedido = false
    
    while (intentos < maxIntentos && !accesoConcedido) {
        print("Ingrese la clave de seguridad: ")
        val entrada = readLine()
        
        if (entrada == claveCorrecta) {
            println("Acceso concedido.")
            accesoConcedido = true
        } else {
            intentos++
            println("Clave incorrecta. Intentos restantes: ${maxIntentos - intentos}")
        }
    }
    
    if (!accesoConcedido) {
        println("CONTROLADOR PLC BLOQUEADO: Se han superado los 3 intentos fallidos.")
    }
}