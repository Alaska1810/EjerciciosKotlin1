/*fun main(args: Array<String>) {
    /*1.Hacer un programa que llene un arreglo de 10 enteros y
    debera elevar al cuadrado cada elemento del arreglo*/

    val miArreglo: Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)
    println("numero = $miArreglo[0]")

    miArreglo.forEach{
        println("Valor: $it")
    }
    val square = pow (number = miArreglo[0])
    println("Cuadrado0: $square")
    val square1 = pow (number = miArreglo[1])
    println("Cuadrado1: $square1")
    val square2 = pow (number = miArreglo[2])
    println("Cuadrado2: $square2")
    val square3 = pow (number = miArreglo[3])
    println("Cuadrado3: $square3")
    val square4 = pow (number = miArreglo[4])
    println("Cuadrado4: $square4")
    val square5 = pow (number = miArreglo[5])
    println("Cuadrado5: $square5")
    val square6 = pow (number = miArreglo[6])
    println("Cuadrado6: $square6")
    val square7 = pow (number = miArreglo[7])
    println("Cuadrado7: $square7")
    val square8 = pow (number = miArreglo[8])
    println("Cuadrado8: $square8")
    val square9 = pow (number = miArreglo[9])
    println("Cuadrado9: $square9")
}
fun pow(number: Int, pow: Int = 2):Int{
    var result: Int = 1
    for(i in 1..pow){
        result = result * number
    }
    return result
}*/
/*fun main(args: Array<String>) {
    /* 2.Hacer un programa que pida un número entre 1 y 9999 y
    nos diga cuantas unidades de millar, centenas, decenas y unidades tiene
     */
    var n1: Int
    println("Digita un número que este entre 1 y 9999")
    print("Digita una cantidad:")
    n1 = readLine()?.toInt() as Int

    if(n1 >=1 && n1 <= 9999){
        var uni: Int = n1/1
        var dec:Int = n1/10
        var cen:Int = n1/100
        var mill:Int = n1/1000

        println("La cantidad que tiene en unidad: $uni")
        println("La cantidad que tiene en decena: $dec")
        println("La cantidad que tiene en centena: $cen")
        println("La cantidad que tiene en  millar: $mill")
    }else{
        println("La cantidad que ingreso no esta dentro del rango")
    }
}*/
/*fun main() {
    //3. Hacer un programa que pida un número en decimal y nos devuelva su equivalente en
    //binario, octal y hexadecimal.
    println("Ingrese un numero decimal:")
    val n = readLine()!!.toInt()

    val binary: String = Integer.toBinaryString(n)

    println("Equivalente binario: $binary ")

    val octalResult = Integer.toOctalString(n)

    println("Equivalente Octal: $octalResult")

    val hexadecimal: String = Integer.toHexString (n)
    println("Equivalente Hexadecimal: $hexadecimal")

}*/
/*fun main(Args: Array<String>) {
    //4. Hacer un programa que pida una cadena y nos diga si es palíndromo o no.
    var (igual, aux) = Pair(0, 0)
    var texto: String
    print("Ingrese la palabra que desea evaluar: ")
    texto = readLine() as String
    var reverse = texto.reversed()
    if(texto == reverse) {
        println("$texto es palindromo!!")
    } else {
        println("$texto no es palindromo!!")
    }
}*/
/*fun main(args: Array<String>) {
    /*5.Hacer un programa que pida el valor de los lados de
    un triángulo y nos diga que tipo de triángulo es.*/

    println("Ingrese los tres lados del triangulo")
    print("Ingrese el primer lado: ")
    var lad1 = readLine()!!.toInt()
    print("Ingrese el segundo lado: ")
    var lad2 = readLine()!!.toInt()
    print("Ingrese el tercer lado: ")
    var lad3 = readLine()!!.toInt()

    if(lad1 == lad2 && lad2 == lad3){
        println("El triángulo es equilátero")
    }else if(lad1 == lad2 && lad2 != lad3){
        println("El triángulo es isosceles")
    }else if(lad1 == lad3 && lad3 != lad2){
        println("El triángulo es isosceles")
    }else if(lad2 == lad3 && lad3 != lad1){
        println("El triángulo es isosceles")
    }else{
        println("El triángulo es escaleno")
    }
}*/
/*fun main(args: Array<String>) {
    /*Hacer un programa que mediante funciones permita calcular
    el factorial de un número.*/
    print("Ingrese un número: ")
    var num = readLine()!!.toInt()

    for (i in num-1 downTo 1){
        num = num * i
    }
    print("El factorial es: $num")
}*/
/*fun main(args: Array<String>) {
    val ordenarPalabras = arrayOf("Montserrat","uno","cuatro","no")

    ordenarPalabras.sortBy{it.length}

    println("Las palabras ordenadas son: ")

    for(cadena in ordenarPalabras){
        println(cadena)
    }
}*/
/*fun main(args: Array<String>) {
    println("Ingrese la palabra:")
    val palabra = readln()
    val vocales="aeiouAEIOU"
    var vocalest = 0
    var contarVocales = mutableMapOf<Char, Int>()

    for (caracter in palabra){
        if(caracter in vocales){
            contarVocales[caracter] = (contarVocales[caracter] ?: 0) + 1
            vocalest++
        }
    }
    println("La palabra $palabra tiene $vocalest vocales en total")
    for ((vocal,contador) in contarVocales){
        println("La vocal $vocal aparece $contador veces")
    }

}*/