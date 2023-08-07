package br.com.alura.collection

fun testaMap2() {
    val pedidos = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0,
        4 to null
    )

    // diferenças entre valores que existem mas são nulos
    // e valores que não existem
    println(pedidos.get(4))
    println(pedidos.get(5))
    //println(pedidos.getValue(5))

    println(pedidos.getOrElse(5) {
        "Pedido inválido !"
    })
    println(pedidos.getOrDefault(0, -1.0))

    println(pedidos.keys)

    val pedidos2 = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0,
        4 to 75.0,
        5 to 96.0,
        6 to 100.0,
        7 to 113.0,
        8 to 230.0
    )
    val filtro = pedidos2.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }
    println(filtro)
    println(pedidos2.filterValues { valor -> valor < 100.0 })
    println(pedidos2.filterKeys { numero -> numero >= 5 })

    val pedidos3: MutableMap<Int, Double> = (pedidos2 + mapOf(9 to 250.0, 10 to 274.0)) as MutableMap<Int, Double>
    println(pedidos3)

    println(pedidos3 - listOf(3, 9))

    //pedidos3.putAll(listOf(3 to 52.0, 7 to 115.0))
    pedidos3 += listOf(3 to 52.0, 7 to 115.0, 11 to 300.0)
    println(pedidos3)

    // remove pelo valor, apenas a 1a ocorrência
    pedidos3.values.remove(100.0)
    println(pedidos3)

    pedidos3 -= 2
    println(pedidos3)
}

fun testaMap(pedidos: MutableMap<Int, Double>, pedido: Double?) {
    println(pedidos)
    //adicionando
    pedidos[4] = 70.0
    pedidos.put(5, 120.0)
    // atualizando
    pedidos[2] = 36.0
    // atualiza caso não exista
    pedidos.putIfAbsent(1, 5.0)
    // remove pela chave
    pedidos.remove(5)
    // remove por chave e valor
    pedidos.remove(4, 80.0)

    pedido?.let {
        println("Pedido $it")
    }
    for (p in pedidos) {
        println("Pedido ${p.key} : ${p.value}")
    }
}