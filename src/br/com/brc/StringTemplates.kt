package br.com.brc

fun main() {
    val name = "Braian"

    // Com Java
    println("My name is " + name + "!")

    // Com Kotlin
    println("My name is $name")

    // Para fazer escape do $
    println("My name is \$name")

    // String template com funções
    print("The total is ${sum(10, 23)}")
}

fun sum(a: Int, b: Int): Int = a + b