package org.example

data class Book(val title: String, val authors: List<String>)

fun main() {
    val books = listOf(
        Book("Thursday Next", listOf("Jasper Fforde")),
        Book("Mort", listOf("Terry Pratchett")),
        Book("Good Omens", listOf("Terry Pratchett",
            "Neil Gaiman"))
    )

    val authors = books.flatMap { it.authors }.toSet()

    val authors2 = books.flatMap { it.authors.toList() }

    println(authors)
    println(authors2)

    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })
    println(strings.flatMap { it.toList() }.toSet())
}
