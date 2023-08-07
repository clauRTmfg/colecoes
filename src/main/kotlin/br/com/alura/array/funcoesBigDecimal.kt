package br.com.alura.array

import java.math.BigDecimal
import java.math.RoundingMode

fun calculaAumento(salario: BigDecimal, aumento: BigDecimal): BigDecimal =
    if (salario < "5000".toBigDecimal()) {
        salario + "300".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array(valores.size) { i -> valores[i].toBigDecimal() }
}

fun Array<BigDecimal>.soma(): BigDecimal {
    return this.reduce { acc, valor -> acc + valor }
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if(this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.soma() / this.size.toBigDecimal()
    }
}
