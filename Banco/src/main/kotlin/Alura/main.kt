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
    try {
        funcao2()
    }catch (e: ClassCastException){
    println(e.message)
    println(e.stackTrace)
    println(e.cause)
    println("ClassCastException foi pegada")
}
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5){
        println(i)
        val endereco = Any()
            endereco as Endereco
    }
    println("fim funcao2")
}













