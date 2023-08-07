package br.com.alura.collection

fun testaSet() {
    //val alunosAndroid = listOf<String>("Clau", "Re", "Thomas", "Simone", "Otone")
    //val alunosKotlin = listOf<String>("Clau", "Re", "Almeida")
    //val todosAlunos = alunosAndroid.plus(alunosKotlin)
    //val todosAlunos = (alunosAndroid + alunosKotlin).distinct()

    val alunosAndroid = mutableSetOf<String>("Clau", "Re", "Thomas", "Simone", "Otone")
    val alunosKotlin = mutableSetOf<String>("Clau", "Re", "Almeida")
    val todosAlunos: MutableSet<String> = (alunosAndroid + alunosKotlin) as MutableSet<String>
//    todosAlunos.addAll(alunosAndroid)
//    todosAlunos.addAll(alunosKotlin)
    todosAlunos.add("Clau")
    todosAlunos.add("Clau")

    println(todosAlunos)
    println(alunosAndroid - alunosKotlin)
    //println(alunosAndroid subtract  alunosKotlin)
    println(alunosAndroid intersect alunosKotlin)
}