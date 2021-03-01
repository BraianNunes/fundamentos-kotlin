package br.com.brc.acessores_customizados

class Retangulo(val altura: Int, val largura: Int) {

    // Um método acessor customizado da propriedade isQuadrado
    val isQuadrado: Boolean
        get() {
            return altura == largura
        }

    val isQuadradoEx2 = altura == largura

    val isQuadradoEx3
        get() = altura == largura
}

fun main() {
    val retangulo = Retangulo(10, 10)
    println(retangulo.isQuadrado)
}

