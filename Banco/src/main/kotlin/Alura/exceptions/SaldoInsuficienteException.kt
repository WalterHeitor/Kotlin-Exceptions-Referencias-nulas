package Alura.exceptions

class SaldoInsuficienteException(
    mensagem: String = "Saldo e insufiente!"
) : Exception(mensagem) {
}