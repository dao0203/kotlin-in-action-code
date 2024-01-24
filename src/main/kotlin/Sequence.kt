package org.example

fun main() {

    // when use list, the map and filter will be executed immediately
    listOf(1, 2, 3)
        .map { println("map($it)"); it * it }
        .filter { println("filter($it)"); it > 1 }
        .toList()

    // when use sequence, the map and filter will be executed when the list is iterated
    listOf(1, 2, 3).asSequence()
        .map { println("map($it)"); it * it }
        .filter { println("filter($it)"); it > 1 }
        .toList()

    // sequence is lazy, so it can be infinite
    val numbers = generateSequence(0) { it + 1 }
    val numbersTo100 = numbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())
}
