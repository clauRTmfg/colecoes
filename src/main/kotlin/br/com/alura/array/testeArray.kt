package br.com.alura.array

fun testeArray() {
    val x = IntArray(10)
    val y = intArrayOf(1, 2, 3, 4, 5)
    val z = doubleArrayOf(1.0, 2.4, 10.8, 7.7)
    val c: Int = 0

    y[1] = 8 /* variaveis de array podem ser alteradas */
    y.forEach { i -> println(i) }

    println(z.max())

    println(z.contentToString())

    val contatos = arrayOf("Clau", "Re", "Thomas")
    contatos.forEach { s -> println(s) }
}