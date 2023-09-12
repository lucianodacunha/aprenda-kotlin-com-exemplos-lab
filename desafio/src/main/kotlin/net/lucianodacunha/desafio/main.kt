package net.lucianodacunha.desafio

enum class Nivel {
    BASICO,
    INTERMEDIARIO,
    AVANCADO
}

enum class TipoDeConteudoEducacional {
    BOOTCAMP,
    FORMACAO,
    CODECAMP,
    ACELERACAO,
    CURSO,
    PROJETO,
    MASTERCLASS,
    MENTORIA
}

class Usuario(val username: String, val nome: String)

abstract class ConteudoEducacional(val nome: String, val duracao: Int,
                               val nivel: Nivel,
                               val tipo : TipoDeConteudoEducacional){
    val inscritos = mutableSetOf<Usuario>()
    abstract fun matricular(usuario: Usuario)
    abstract fun cancelarMatricula(usuario : Usuario)
}
