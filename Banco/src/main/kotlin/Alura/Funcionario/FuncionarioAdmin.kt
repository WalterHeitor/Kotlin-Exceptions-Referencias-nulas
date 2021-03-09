package Alura.Funcionario

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: String
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel{

    override fun autentica(senha: String): Boolean{
        if(this.senha == senha){
            return true
        }
        return false
    }
}