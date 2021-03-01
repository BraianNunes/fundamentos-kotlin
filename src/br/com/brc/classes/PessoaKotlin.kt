package br.com.brc.classes

// public é a visibilidade default em Kotlin
data class PessoaKotlin (
    val nome: String,
    val idade: Int,
    var isCasado: Boolean
)

fun main() {
    val pessoa1 = PessoaKotlin("Braian", 32, false)
    pessoa1.isCasado = true

    val pessoa2 = PessoaKotlin("Abraão", 13, false)

    val pessoa3= PessoaKotlin("Franklin", 25, true)
    pessoa3.isCasado = false

    println("Pessoa 1: ${pessoa1.nome}")
    println("Pessoa 2: ${pessoa2.nome}")
    println("Pessoa 3: ${pessoa3.nome}")

    // Pessoa mais velha
    val pessoas = listOf(pessoa1, pessoa2, pessoa3)

    val maisVelha = pessoas.maxByOrNull { it.idade ?: 0 }
    // ?: Elvis Operator

    println(maisVelha)
}
