package br.com.alura.collection

fun testaCopia() {
    val banco = BancoDeNomes()
    val bancoCopia: Collection<String> = banco.nomes
    banco.salva("Clau")
    println(banco.nomes)
    println(bancoCopia)
}

class BancoDeNomes {

    // toList é para gerar uma cópia do objeto original
    // evitando que os dados originais sejam manipulados
    val nomes: Collection<String> get() = Companion.dados.toList()

    fun salva(nome: String){
        Companion.dados.add(nome)
    }

    // isto faz com que "dados" seja atributo static
    companion object {
        private val dados = mutableListOf<String>()
    }
}
