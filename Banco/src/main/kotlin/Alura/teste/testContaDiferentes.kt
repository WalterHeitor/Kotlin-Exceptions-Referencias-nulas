package Alura.teste

import Alura.cliente.Cliente
import Alura.cliente.Endereco
import Alura.conta.ContaCorrente
import Alura.conta.ContaPoupanca

fun testaContasdiferentes() {
    val walter = Cliente(nome = "walter", cpf = "111.111.111.11", senha = "123", endereco = Endereco(
        logadouro = "Rua AltoHorizonte",
        135,
        "morada dos sonhos 2",
        "GOIAS",
        "75528-118",
        "Ultima rua."
    ))


    val contaCorrente = ContaCorrente(
        titular = walter,
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = Cliente("maria", "222.222.222.22", senha = "123"),
        numero = 1100
    )

    println("---------------------------------------------------")
    println("titular ${contaCorrente.titular.nome}")
    println("CPF do titular ${contaCorrente.titular.cpf}")
    println("Endereco: ${contaCorrente.titular.endereco.logadouro}")
    println("Numero: ${contaCorrente.titular.endereco.numero}")
    println("----------------------------------------------------")

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("contaCorrente ${contaCorrente.saldo}")
    println("contaPoupanca ${contaPoupanca.saldo}")
    println("-------------------------------------")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("contaCorrente apos saque ${contaCorrente.saldo}")
    println("contaPoupanca apos saque ${contaPoupanca.saldo}")
    println("-------------------------------------")

    contaCorrente.tranfere(100.0, contaPoupanca, "123")
    println("contaCorrente apos transferir para poupanca ${contaCorrente.saldo}")
    println("contaPoupanca apos receber tranferencia ${contaPoupanca.saldo}")
    println("-------------------------------------")

    contaPoupanca.tranfere(100.0, contaCorrente, "123")
    println("contaPoupanca apos transferir para poupanca ${contaPoupanca.saldo}")
    println("contaCorrente apos receber tranferencia ${contaCorrente.saldo}")
    println("-------------------------------------")
}