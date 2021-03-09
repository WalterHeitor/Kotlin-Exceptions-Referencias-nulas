package Alura.cliente

class Endereco (
    var logadouro: String = "",
    var numero: Int = 0,
    var bairro: String = "",
    var estado: String = "",
    var cep: String = "",
    var complemento: String = "",
        ){
    override fun toString(): String {
        return """"Endereco(logadouro='$logadouro', numero=$numero, 
            | bairro='$bairro', estado='$estado', 
            | cep='$cep', complemento='$complemento')
            | """.trimMargin()
    }

    override fun equals(other: Any?): Boolean {
        if(other != null && other is Endereco){
            return this.cep == other.cep
        }
        return false
    }

    override fun hashCode(): Int {
        return cep.hashCode()
    }
}
