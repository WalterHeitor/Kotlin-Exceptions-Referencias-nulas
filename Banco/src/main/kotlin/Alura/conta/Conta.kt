package Alura.conta

import Alura.cliente.Cliente




/**
 * ------------- Conta Mãe -------------------------
 */
abstract class Conta(
    val titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set
    companion object Contador{
        var total = 0
            private set
        fun incrementa(){
            total++
        }
    }
    init {
        println("Criando conta")
        total++
    }

    open fun deposita(valor: Double) {
        if (valor > 0) this.saldo += valor
    }

    abstract fun saca(valor: Double)

    fun tranfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
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