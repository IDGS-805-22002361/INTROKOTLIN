fun main() {
    var carga = 0
    val cargaPorMinuto = 15 
    
    println("Iniciando carga... Carga actual: $carga%")
    
    while (carga < 100) {
        carga += cargaPorMinuto
        if (carga > 100) carga = 100 
        
        println("Cargando... $carga%")
    }
    
    println("Ciclo detenido. Carga completa al $carga%.")
}