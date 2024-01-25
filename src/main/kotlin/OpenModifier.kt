package org.example

open class BaseClass {
    //     private val name = "Kotlin"
//    protected val name = "Kotlin"
//     internal val name = "Kotlin"
    val name = "Kotlin"

    open fun print() = println("Hello BaseClass")
}

class SubClass : BaseClass() {


    override fun print() = println("Hello $name")
}

fun SubClass.getName() = name

fun main() {
    val baseClass = BaseClass()
    baseClass.print()

    val subClass = SubClass()
    subClass.print()

    println(subClass.getName())
}