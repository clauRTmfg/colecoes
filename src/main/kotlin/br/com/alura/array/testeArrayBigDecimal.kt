package br.com.alura.array

import java.math.BigDecimal
import java.math.RoundingMode

fun testeArrayBigDecimal() {
    val lista = Array<BigDecimal>(5) { BigDecimal.ZERO }
    lista[0] = "2300.00".toBigDecimal()
    println(lista.contentToString())

    val salarios = bigDecimalArrayOf("1500.00", "2000.00", "5000.00", "7200.00")
    val base = "1500".toBigDecimal()
    val topo = "7000".toBigDecimal()
    val contador = salarios.count { it in base..topo }

    println(salarios.contentToString())
    println("$contador salarios dentro da faixa")

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumento(salario, aumento) }
        .toTypedArray()
    println(salariosComAumento.contentToString())

    val gastoInicial: BigDecimal = salariosComAumento.soma()
    println(gastoInicial)

    val meses = 6.toBigDecimal()
    // a diferença entre reduce e fold é que fold recebe valor inicial
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acc, salario ->
        acc + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println(gastoTotal)

    val media3MaioresSalarios = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()
    println(media3MaioresSalarios)
}