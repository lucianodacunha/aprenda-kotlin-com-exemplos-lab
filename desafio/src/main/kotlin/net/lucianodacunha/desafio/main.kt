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
