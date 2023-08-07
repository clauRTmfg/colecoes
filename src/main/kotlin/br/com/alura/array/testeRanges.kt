package br.com.alura.array

fun testeRanges() {
    val numerosPares = 0..40 step 2 /* aqui o 100 é incluso */
    val serie2 = 2.until(100) /* aqui o 100 não é incluso */
    val serieReversa = 20 downTo 1

    for (i in numerosPares) {
        print("$i ")
    }

    println()

    serieReversa.forEach { print("$it ") }
    println()

    val x = 23

    if (x in numerosPares) {
        println("$x está dentro da série")
    } else {
        println("$x não faz parte desta série")
    }

    val alfabeto = 'a'..'z'
    val letra = 'X'
    println(letra in alfabeto)

    val serie: IntRange = 0.rangeTo(50)
    val y = serie.all { it < 100 }
    val z = serie.any { it > 50 }
    val lista = serie.filter { it > 40 }

    println("todos menores que 100 ?  $y")
    println("algum maior que 50 ?  $z")
    println("maiores que 40 : $lista")

    val idades = intArrayOf(10, 13, 18, 25, 40)
    val busca = idades.find { it >= 21 }
    println("primeiro maior que 18 : $busca")
}