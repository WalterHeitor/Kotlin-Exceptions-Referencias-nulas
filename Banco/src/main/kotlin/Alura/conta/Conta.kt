package Alura.conta

import Alura.Funcionario.Autenticavel
import Alura.cliente.Cliente
import Alura.exceptions.FalhaAutenticacaoException
import Alura.exceptions.SaldoInsuficienteException


/**
 * ------------- Conta Mãe -------------------------
 */
abstract class Conta(
    val titular: Cliente,
    val numero: Int
) : Autenticavel{
    var saldo = 0.0
        protected set

    companion object Contador {
        var total = 0
            private set

        fun incrementa() {
            total++
        }
    }

    init {
        println("Criando conta")
        total++
    }

    override fun autentica(senha: String): Boolean {
        return titular.autentica(senha)
    }

    open fun deposita(valor: Double) {
        if (valor > 0) this.saldo += valor
    }

    abstract fun saca(valor: Double)

    fun tranfere(valor: Double, destino: Conta, senha: String) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(mensagem = "O saldo e insuficiente, o saldo atual" +
                    " e: ${saldo}, o valor a ser subtraido: ${valor}")
        }
        if(!autentica(senha)){
            throw FalhaAutenticacaoException()
        }
        saldo -= valor
        destino.deposita(valor)
    }

}

/**
 * ------------- Conta Corrente -------------------------
 */
class ContaCorrente(
    titular: Cliente,
    numero: Int,
) : Conta(
    titular = titular,
    numero = numero
) {

    override fun saca(valor: Double) {
        val valorTaxa = valor + 0.1
        if(this.saldo >= valorTaxa){
            this.saldo -= valorTaxa
        }
    }


}
/**
 * ------------- Conta Poupança -------------------------
 */
class ContaPoupanca(
    titular: Cliente,
    numero: Int,
) : Conta(
    titular = titular,
    numero = numero
) {

    override fun saca(valor: Double) {
        if (valor <= this.saldo){
            this.saldo = this.saldo - valor
        }
    }
}