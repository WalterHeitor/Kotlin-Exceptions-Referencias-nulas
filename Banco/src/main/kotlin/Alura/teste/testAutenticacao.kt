package Alura.teste

import Alura.Funcionario.Diretor
import Alura.Funcionario.Gerente
import Alura.cliente.Cliente
import Alura.sistema.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "WalterH",
        cpf = "999.999.999.99",
        5000.0,
        "123"
    )
    val diretor = Diretor(
        nome = "MariaC",
        cpf = "333.333.333.33",
        salario = 7000.0,
        plr = 200.0,
        senha = "321"
    )
    val cliente = Cliente(
        nome = "Alexsandro",
        cpf = "123.123.123.12",
        senha = "123"
    )

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(gerente, "123")
    sistemaInterno.entra(diretor, "321")
    sistemaInterno.entra(cliente, "123")
}