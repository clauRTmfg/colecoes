package br.com.alura.list

/* Utilizando List<> ao invés de MutableList<>
   para que as operações de ordenação não sejam sobre
   a lista original, mas sim retornando novos objetos
   ordenados.
 */
class Estante(
    val genero: String,
    val livros: List<Livro>
) {
    fun organizaPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor }
    }

    fun organizaPorAno(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao }
    }
}