package io.jimmyoak.kotlinworkshop.solutions

/*

Write a program which converts data() into a string (ints to its ascii representation) and outputs de result as String

Write a program which converts data2() applying ROT-13 and outputs the result as a String (control only from A to Z)

*/

fun data() = listOf(106, 105, 109, 109, 121)

fun data2() = "WVZZL"

fun rot13(letter: Char) = if (letter in 'A'..'M') (letter.toInt() + 13).toChar() else (letter.toInt() - 13).toChar()

fun main(args: Array<String>) {
    println(data().map(Int::toChar).joinToString(""))
    println(data2().map(::rot13).joinToString(""))
}