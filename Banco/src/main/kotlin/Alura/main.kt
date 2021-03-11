package Alura

import Alura.cliente.Endereco


fun main() {
    var enderecoNulo: Endereco? = Endereco(logadouro = "rua vergueiro", complemento = "prédio")
    val logradouroNovo: String? = enderecoNulo?.logadouro
    enderecoNulo?.let {
        println(it.logadouro.length)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println(tamanhoComplemento)
    }
    var enderecoNulo2: Endereco? = Endereco(logadouro = "rua Rubens Jose Tavares")

    enderecoNulo2?.let {
        val tamanho: Int = it.complemento?.length
        if (tamanho == null) throw java.lang.IllegalStateException()
        println(tamanho)
    }

//    endereco!!.logadouro
//    val enderecoNaoNulo: Endereco = enderecoNulo!!
//    enderecoNaoNulo.logadouro
//    val logadouroNovo: String? = enderecoNulo?.logadouro
//
//    enderecoNulo?.let {
//        println(it.logadouro)
//        val tamanhoComplemento: Int =
//            it.complemento.length ?:
//    }
//
//    enderecoNulo?.let {endereco: Endereco ->
//        val i: Int = endereco.complemento.length ?: throw IllegalStateException()
//        println(endereco.logadouro.length)
//
//        println("")
//    }
//    println(logadouroNovo)


    
}

















