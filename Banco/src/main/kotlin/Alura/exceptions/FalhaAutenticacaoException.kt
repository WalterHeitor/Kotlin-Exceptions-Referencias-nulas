package Alura.exceptions

class FalhaAutenticacaoException(
    mensagem: String = "Falha na autenticacao"
) : Exception(mensagem) {

}