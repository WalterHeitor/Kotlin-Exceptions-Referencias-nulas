package Alura.teste

import Alura.Funcionario.Autenticavel
import Alura.cliente.Cliente
import Alura.conta.Conta
import Alura.conta.ContaCorrente
import Alura.conta.ContaPoupanca
import Alura.sistema.SistemaInterno

fun testaObject() {
    val heitor = object : Autenticavel {
        val nome: String = "Heitor"
        val cpf: String = "444.444.444.44"
        val senha: String = "123"

        override fun autentica(senha: String) = this.senha == senha
    }
    println("nome do cliente ${heitor.nome} e cpf: ${heitor.cpf}")
    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(heitor, heitor.senha)

    val walter = Cliente("walter", "111.111.111.11", senha = "123")
    val contaCorrente = ContaCorrente(walter, 1)
    val contaCorrente1 = ContaCorrente(walter, 2)
    val contaPoupanca = ContaPoupanca(walter, 3)

    testaContasdiferentes()

    println("Total contas ${Conta.total}")
}