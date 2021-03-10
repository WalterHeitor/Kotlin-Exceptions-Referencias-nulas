package Alura.teste

import Alura.exceptions.SaldoInsuficienteException

class testePilha {
    fun funcao1(){
        println("início funcao1")
        try {
            funcao2()
        }catch (e: ClassCastException){
            e.printStackTrace()
            println("ClassCastException foi pegada")
        }
        println("fim funcao1")
    }

    fun funcao2() {
        println("início funcao2")
        for (i in 1..5){
            println(i)
            val endereco = Any()
            throw SaldoInsuficienteException()
            // endereco as Endereco
        }
        println("fim funcao2")
    }
}