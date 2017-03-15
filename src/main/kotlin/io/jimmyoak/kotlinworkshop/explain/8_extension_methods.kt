package io.jimmyoak.kotlinworkshop.explain

class SomeClass(val value: String)

fun main(args: Array<String>) {
    fun SomeClass.ok() = println("Ok ${this.value}!")

    val some = SomeClass("Jimmy")
    some.ok()
}