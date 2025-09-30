fun main() {
    //ejercicio1()
    //ejercicio2()
    //ejercicio3()
    //ejercicio4()
    //ejercicio5()
    ejercicio6()

}

fun ejercicio1(){
    var numero : Int? = null
    println("Introduce un numero")
    numero = readln().toInt()
    if (numero%2 == 0){
        println("El numero es par")
    }else{
        println("El numero es impar")
    }
}

fun ejercicio2(){
    var num : Int? = null
    println("Introduce un numero: ")
    num = readln().toInt()
    if (num > 0){
        println("El numero $num es positivo")
    }else if (num == 0){
        println("El numero $num es igual a cero")
    }else {
        println("El numero $num es negativo")
    }

}

fun ejercicio3(){
    println("Introduce un numero: ")
    val numero = readln()!!.toInt()

    if (esPrimo(numero)) {
        println("El numero $numero es primo")
    } else {
        println("El numero $numero no es primo")
    }
}

fun  esPrimo(n: Int): Boolean{
    if (n <= 1) return false
    if (n <= 2) return true

    if (n %2 == 0 || n % 3 ==0) return false
    var i = 5
    while (i * i <= n){
        if (n % i == 0 || n% (i + 2) == 0) return false
        i += 6
    }
    return true
}

fun ejercicio4(){
    println("Introduce un numero: ")
    val num = readln()!!.toInt()

    val primos = mutableListOf<Int>()

    for (i in 2..num){
        if (esPrimo(i)){
            primos.add(i)
        }
    }

    println("Los numero primos son menores o igualesa $num son: ${primos.joinToString(", ")}")
}

fun ejercicio5(){
    println("Introduce un numero: ")
    val num = readln()!!.toInt()

    var factorial = 1L

    for (i in 2..num){
        factorial *= i
    }

    println("El factorial de $num es: $factorial")
}

fun ejercicio6(){
    println("Introduce un numero: ")
    val n = readln()!!.toInt()

    val suma = n *(n+1) / 2

    println("La suma de los primeros $n naturales es: $suma ")
}

fun ejercicio7(){
    println("Introduce un numero: ")
    val numero = readln()!!.toInt()

    var n = numero
    var suma = 0

    while (n > 0){
        suma += n % 10
        n /= 10
    }

    println("La suma de los digitos de $numero es: $suma")
}




