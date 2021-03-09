package Alura.sistema

import Alura.Funcionario.Autenticavel
import Alura.Funcionario.FuncionarioAdmin

class SistemaInterno {
    fun entra(admin: Autenticavel, senha: String){
        if(admin.autentica(senha)){
            println("Bem vindo ao WalterBank ")
        }else {
            println("Falha na autenticacao")
        }
    }
}