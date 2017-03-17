package io.jimmyoak.kotlinworkshop.exercises

/*

Write a program which converts data() into a string (ints to its ascii representation)

Write a program which converts data2() applying ROT-13 and outputs the result as a String (control only from A to Z)

Write a program which fins prime numbers between 0 and 50 and sums them

*/

fun data() = listOf(106, 105, 109, 109, 121)

fun data2() = "WVZZL"

fun main(args: Array<String>) {
    val string = data()
            .map(Int::toChar)
            .joinToString("")
    println(string)


    (1..50)
            .filter(::isPrime)
            .forEach(::println)

    val sum = (1..50)
            .filter(::isPrime)
            .sum()
    println(sum)

}

fun isPrime(number: Int): Boolean {
    return (1..number/2)
            .filter { number % it == 0 }
            .count() <= 1
}

