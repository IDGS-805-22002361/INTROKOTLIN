/*
La estructura basica en kotlin de una clase es:
class[nombre de la clase]
[propiedades de la clase]
[metodos o funciones de la clase]
*/

class Persona constructor(nombre:String, edad:Int){
    var nombre:String = nombre
    var edad:Int = edad

    fun imprimir(){
        println("Nombre: $nombre y tiene una edad de $edad")
    }

    fun esMayorEdad(){
        if (edad >= 18)
            println("$nombre es mayor de edad")
        else
            println("$nombre es menor de edad")
    }



}

fun main(){
    val persona1: Persona
    persona1 = Persona("juan", 12)
    persona1.imprimir()
    persona1.esMayorEdad()
}