package net.lucianodacunha.desafio.main

import net.lucianodacunha.desafio.entities.ConteudoEducacional
import net.lucianodacunha.desafio.entities.Nivel
import net.lucianodacunha.desafio.entities.TipoDeConteudoEducacional
import net.lucianodacunha.desafio.entities.Usuario

fun main(){
    val usuario1 = Usuario("user1", "User 1")
    val usuario2 = Usuario("user2", "User 2")
    val usuario3 = Usuario("user3", "User 3")

    val bootcampDeKotlin = ConteudoEducacional(
        nome = "Code Update TQI - Backend com Kotlin e Java",
        nivel = Nivel.INTERMEDIARIO,
        tipo = TipoDeConteudoEducacional.BOOTCAMP
    )

    bootcampDeKotlin.adicionarConteudoEducacional(
        ConteudoEducacional(
            nome = "Conhecendo Kotlin e sua Documentaçao Oficial",
            duracao = 1,
            nivel = Nivel.BASICO,
            tipo = TipoDeConteudoEducacional.CURSO
        )
    )

    bootcampDeKotlin.adicionarConteudoEducacional(
        ConteudoEducacional(
            nome = "Estruturas de Controle de Fluxo e Coleções em Kotlin",
            duracao = 2,
            nivel = Nivel.BASICO,
            tipo = TipoDeConteudoEducacional.CURSO
        )
    )

    bootcampDeKotlin.adicionarConteudoEducacional(
        ConteudoEducacional(
            nome = "Introdução Prática à Linguagem de Programação Kotlin",
            duracao = 2,
            nivel = Nivel.BASICO,
            tipo = TipoDeConteudoEducacional.CURSO
        )
    )
    bootcampDeKotlin.matricular(usuario1)
    bootcampDeKotlin.matricular(usuario2)
    bootcampDeKotlin.matricular(usuario3)

    // impressão dos conteúdos educacionais
    imprimir(bootcampDeKotlin, "")

    // impressão dos usuários inscritos
    println("USUÁRIOS:")
    println("\tNOME")
    for (pessoa in bootcampDeKotlin.inscritos){
        println("\t${pessoa.nome}")
    }
}

fun imprimir(conteudo : ConteudoEducacional, level: String){
    println(String.format(
        "%s%-55s%-4s%-15s%s", level, "NOME", "CH", "NÍVEL", "TIPO"
    ))

    println(String.format(
        "%s%-55s%-4s%-15s%s",
        level, conteudo.nome, conteudo.duracao, conteudo.nivel, conteudo.tipo
    ))

    for (subconteudo in conteudo.conteudosEducacionais){
        imprimir(subconteudo, "\t")
    }
}
