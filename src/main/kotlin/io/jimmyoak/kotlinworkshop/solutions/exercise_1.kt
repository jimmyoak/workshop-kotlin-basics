package io.jimmyoak.kotlinworkshop.solutions

fun fizzbuzz(number: Int): String = when {
    number % 15 == 0 -> "FizzBuzz"
    number % 3 == 0 -> "Fizz"
    number % 5 == 0 -> "Buzz"
    else -> "$number"
}

fun main(args: Array<String>) {
    (0..100).map(::fizzbuzz).forEach(::println)
}