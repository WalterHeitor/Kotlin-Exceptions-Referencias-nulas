package Alura.Funcionario

class Gerente (
    nome: String,
    cpf: String,
    salario: Double,
    senha: String
        ) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
){
    override val bonificacao: Double
        get() {
            println("Bonificacao Gerente")
            return  salario * 0.1
        }


}