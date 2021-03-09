package Alura.Funcionario

class Diretor (
    nome: String,
    cpf: String,
    salario: Double,
    val plr: Double,
    senha: String
        ) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
){
    override val bonificacao: Double
        get() {
            println("Bonificacao Diretor")
            return salario * 0.2 + plr
        }


}