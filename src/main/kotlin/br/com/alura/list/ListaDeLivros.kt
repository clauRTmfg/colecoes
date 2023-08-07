package br.com.alura.list

fun main() {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)
    val livrosComNulos: MutableList<Livro?> = mutableListOf(null, livro1, livro2, null, livro3, livro4)

    livros.add(
        Livro(
            titulo = "Sou Dessas",
            autor = "Clau MFG",
            anoPublicacao = 2023,
            editora = "Cara De Pau"
        )
    )

    livros.sorted().imprime()
    livros.sortedBy { it.titulo }.imprime()
    livros.sortedBy { it.autor }.imprime()
    livros.filter { it.autor == "Clau MFG" }.imprime()
    livros.filter { it.autor.startsWith("João")}.imprime()
    println(livros.map { it.titulo })

    livrosComNulos.imprimeComNulos()

    livros
        .groupBy { it.editora ?: "N/A"}
        .forEach { (editora, livros) ->
            println("$editora : ${livros.joinToString { it.titulo }}")
        }

    val estante = Estante(genero = "Literatura", livros = livros)
    estante.organizaPorAutor().imprime()
    estante.organizaPorAno().imprime()
}

