package Alura.teste

import Alura.Funcionario.Analista
import Alura.Funcionario.CalculaBonificacao
import Alura.Funcionario.Diretor
import Alura.Funcionario.Gerente

fun testaFuncionarios() {
    val walter = Analista(
        nome = "Walter heitor",
        cpf = "111.111.111.11",
        salario = 2500.0,
    )

    val maria = Gerente(
        nome = "maria",
        cpf = "222.222.222.22",
        salario = 4000.0,
        senha = "1234"
    )
    val pandora = Diretor(
        nome = "Pandora",
        cpf = "333.333.333.33",
        salario = 3000.0,
        plr = 200.0,
        senha = "2344"
    )
    val clara = Analista(
        nome = "Clara",
        cpf = "444.444.444.44",
        salario = 2235.0
    )
    println("nome ${walter.nome}")
    println("cpf ${walter.cpf}")
    println("salario ${walter.salario}")
    //println("bonificação ${walter.bonificacao}")
    println("-------------------------------------")
    println("nome ${maria.nome}")
    println("cpf ${maria.cpf}")
    println("salario ${maria.salario}")
    println("bonificação ${maria.bonificacao}")
    println("-------------------------------------")
    println("nome ${pandora.nome}")
    println("cpf ${pandora.cpf}")
    println("salario ${pandora.salario}")
    println("plr ${pandora.plr}")
    println("bonificação ${pandora.bonificacao}")
    println("-------------------------------------")
    println("nome ${clara.nome}")
    println("cpf ${clara.cpf}")
    println("salario ${clara.salario}")
    println("bonificação ${clara.bonificacao}")
    println("-------------------------------------")


    val calculadora = CalculaBonificacao()
    calculadora.registra(walter)
    calculadora.registra(maria)
    calculadora.registra(pandora)
    calculadora.registra(clara)
    println("total de bonificacao ${calculadora.total}")
}