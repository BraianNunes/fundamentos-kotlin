package br.com.brc

fun main(args: Array<String>) {
    println("Hello World")
    println(max(10, 5))
    println(max2(11, 6))
    println(max3(12, 7))
}


// Corpo de declaração
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// Corpo de expressão
fun max2(a: Int, b: Int): Int = if (a > b) a else b

// Corpo de expressão com omissão de tipo
fun max3(a: Int, b: Int) = if (a > b) a else b