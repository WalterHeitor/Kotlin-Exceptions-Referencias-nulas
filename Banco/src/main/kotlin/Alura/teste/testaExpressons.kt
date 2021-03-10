package Alura.teste

import java.lang.NumberFormatException

fun testaExpressao() {
    val entrada: String = "3.1"
    var valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("problema na converçao")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("recebido o valor com taxa: ${valorComTaxa}")
    } else {
        println("valor invalido")
    }
}