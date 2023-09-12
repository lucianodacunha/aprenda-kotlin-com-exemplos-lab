package net.lucianodacunha.desafio.entities

data class ConteudoEducacional(val nome: String, var duracao : Int = 0,
                               val nivel: Nivel,
                               val tipo : TipoDeConteudoEducacional
){
    val inscritos = mutableSetOf<Usuario>()
    val conteudosEducacionais = mutableSetOf<ConteudoEducacional>()

    fun adicionarConteudoEducacional(conteudo: ConteudoEducacional){
        conteudosEducacionais.add(conteudo)
        this.duracao += conteudo.duracao
    }

    fun matricular(usuario: Usuario){
        this.inscritos.add(usuario)

        // matricular nos conteudos educacionais.
        for (conteudo in this.conteudosEducacionais){
            conteudo.matricular(usuario)
        }
    }

    fun cancelarMatricula(usuario : Usuario){
        this.inscritos.remove(usuario)

        // matricular nos conteudos educacionais.
        for (conteudo in this.conteudosEducacionais){
            conteudo.cancelarMatricula(usuario)
        }
    }
}