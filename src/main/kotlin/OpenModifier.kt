package org.example

open class BaseClass {
    open fun print() = println("Hello BaseClass")
}

class SubClass: BaseClass() {
    override fun print() = println("Hello SubClass")
}

fun main() {
    val baseClass = BaseClass()
    baseClass.print()

    val subClass = SubClass()
    subClass.print()
}