import kotlin.math.pow

fun mostrarMayor(v1: Int, v2: Int, v3: Int){
    print("MAyor:")
    if (v1 > v2 && v1 > v3)
        println(v1)
    else
        if (v2 > v3)
            println(v2)
        else
            println(v3)
}

fun retornarMayo2r(v1: Int, v2: Int): Int{
    if (v1 > v2)
        return v1
    else
        return v2
}

fun limpiarPantalla(){
    ProcessBuilder("cmd", "/c", "cls")
        .inheritIO()
        .start()
        .waitFor()
}

fun main(){
    limpiarPantalla()
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    print("Ingrese tercer valor:")
    val valor3 = readln().toInt()

    // limitar numero de decimanles
    println(String.format("%.2f", 3.141698))

    mostrarMayor(valor1, valor2, valor3)

}
