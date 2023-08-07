package br.com.alura.list

fun List<Livro>.imprime() {
    val textoFormatado = this.joinToString(separator = "\n") {
        "* ${it.titulo} / ${it.autor}  / ${it.anoPublicacao}"
    }
    println("#### LISTA DE LIVROS #### \n$textoFormatado")
}

fun List<Livro?>.imprimeComNulos() {
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
        "* ${it.titulo} / ${it.autor}  / ${it.editora}"
    }
    println("#### LISTA DE LIVROS #### \n$textoFormatado")
}