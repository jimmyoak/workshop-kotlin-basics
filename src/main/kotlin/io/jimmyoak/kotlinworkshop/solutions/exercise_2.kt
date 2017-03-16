package io.jimmyoak.kotlinworkshop.solutions

/*

Write a program which converts data() into a string (ints to its ascii representation)

Write a program which converts data2() applying ROT-13 and outputs the result as a String (control only from A to Z)

Write a program which fins prime numbers between 0 and 50 and sums them

*/

fun data() = listOf(106, 105, 109, 109, 121)

fun data2() = "WVZZL"

fun rot13(letter: Char) = if (letter in 'A'..'M') (letter.toInt() + 13).toChar() else (letter.toInt() - 13).toChar()

fun Int.isPrime() = (2 until this).filter { this % it == 0 }.isEmpty()

fun primeNumbersSum() = (1..50).filter(Int::isPrime).sum()

fun main(args: Array<String>) {
    println(data().map(Int::toChar).joinToString(""))
    println(data2().map(::rot13).joinToString(""))
    println(primeNumbersSum())
}