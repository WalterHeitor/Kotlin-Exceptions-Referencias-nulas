package Alura

import Alura.cliente.Endereco
import java.lang.ArithmeticException

fun main() {
    println("início main")
    try {
        10/0
    }catch (e: ArithmeticException){
        println("ArithmeticException foi pegada")
    }
    funcao1()
    println("fim main")
}

fun funcao1(){
    println("início funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5){
        println(i)
        val endereco = Any()
        try {
            endereco as Endereco
        }catch (e: ClassCastException){
            println("ClassCastException foi pegada")
        }

    }
    println("fim funcao2")
}













