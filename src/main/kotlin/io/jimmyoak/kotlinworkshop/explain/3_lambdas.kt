package io.jimmyoak.kotlinworkshop.explain

typealias Stringifier = (Int) -> String

fun stringify(number: Int, stringifier: Stringifier) = stringifier(number).toLowerCase().trim()

fun main(args: Array<String>) {
    val callback: Stringifier = {
        limit -> (0..limit)
            .map { "Hi" }
            .joinToString()
    }

    val b = stringify(5, callback)

    println(b)


    val a = stringify(3) {
        when(it) {
            in 0..5 -> "less than or equal to five"
            else -> "more than five"
        }
    }

    println(a)
}