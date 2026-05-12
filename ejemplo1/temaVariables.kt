

fun main(){
    val saludo: String = "Hola" //Inmutable
    var nombre: String = "Kotlin" //Mutable
    println("$saludo, $nombre!!!")


    println("Ingresa el primer numero")
    val num1: Int = readLine()!!.toInt()

    println("Ingresa el segundo numero")
    val num2: Int = readLine()!!.toInt()

    var res = num1 + num2;

    println("La suma es: $res")

}