package br.com.alura

fun main() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0),
    )
    println(pedidos)
//    val pedidosMapeados = pedidos.associate { pedido: Pedido ->
//        Pair(pedido.numero, pedido)
//    }
    // aqui o mesmo resultado, mas usando associateBy
    val pedidosMapeados = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMapeados)

    val pedidosFreteGratis = pedidos.associateWith { pedido ->
        pedido.valor > 50
    }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(numero = 2, valor = 60.0)])

    // usando groupBy é possivel ter um mapa com índices repetidos
    val pedidosFGAgrupados = pedidos.groupBy { pedido: Pedido -> pedido.valor > 50 }
    println(pedidosFGAgrupados)
    println(pedidosFGAgrupados[true])

    val nomes = listOf<String>("Clau", "Re", "Thomas", "CRT", "Rosana", "Renata")
    val agenda = nomes.groupBy { nome -> nome.first() }
    println(agenda)
    println(agenda['R'])

    val pedidosAgrupados: Grouping<Pedido, Boolean> = pedidos.groupingBy { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosAgrupados.eachCount())
    
}

data class Pedido(val numero: Int, val valor: Double)













