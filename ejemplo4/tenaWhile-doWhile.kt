fun main(){
    var x = 0
    while(x<=10){
        println(x)
        x+=1
    }
    var cant = 0
    var suma = 0
    do{
        print("Ingrese un valor (0 para finalizar):")
        val valor = readln().toInt()
        if(valor !=0){
            suma+=valor
            cant++
        }
    }while (valor!= 0)
    if (cant != 0){
        val promedio = suma / cant
        println("El promedio es: $promedio")
    }else{
        println("No se ingresaron valores.")
    
    }
}