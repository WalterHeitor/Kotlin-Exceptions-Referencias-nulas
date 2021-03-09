package Alura.cliente

import Alura.Funcionario.Autenticavel

class Cliente(
    val nome: String,
    val cpf: String,
    val endereco: Endereco = Endereco(),
    protected val senha: String
) : Autenticavel{
    override fun autentica(senha: String): Boolean{
        if(this.senha == senha){
            return true
        }
        return false
    }


}