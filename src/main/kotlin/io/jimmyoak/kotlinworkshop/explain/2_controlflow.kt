package io.jimmyoak.kotlinworkshop.explain

import java.util.*

fun isDebug(): Boolean = false

fun random(): Int = Random().nextInt(10)

fun ordinalSuffix(number: Int): String = when (number % 10) {
    1 -> "st"
    2 -> "nd"
    3 -> "rd"
    else -> "th"
}

fun ordinal(number: Int) = "$number${ordinalSuffix(number)}"

fun main(args: Array<String>) {
    if (isDebug()) {
        println("Debug mode activated!")
    }

    val randomNumber = random()
    if (randomNumber in 1..3) {
        println("Number is between 1 and 3")
    }

    println(ordinal(randomNumber))

    val someValue: Any = "Jimmy"
    when (someValue) {
        is String -> println("It was a String: $someValue")
        is Number -> println("It was a number")
        else -> println("No fucking idea what it was")
    }
}
