package Alura

import Alura.cliente.Endereco

fun main() {

    println()
    println(1)
    println(0.1)
    println(true)
    println("teste")
    val endereco = Endereco("rua alto belavista", 182, "morada dos sonhos", "goias", "22222-222")
    val endereco1 = Endereco("rua rubens jose tavares", 49, cep = "22222-222")
    println(endereco.toString())
    println(endereco.hashCode())
    println(endereco.equals(endereco1))
}











