package io.jimmyoak.kotlinworkshop.exercises

/*

Write a program which prints numbers from 1 to 100, but applying next rules:
Return Fizz if number is divisible by 3
Return Buzz if number is divisible by 5
Return FizzBuzz if number is divisible by 3 and 5

Output example:
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
..
*/

fun main(args: Array<String>) {
    fizzBuzz(100)
}

fun fizzBuzz(number: Int) {
    fun divisibleBy(number: Int, factor: Int) = number % factor == 0

    for (i in 1..number) {
        when {
            divisibleBy(i, 3) && divisibleBy(i, 5) -> println("FizzBuzz")
            divisibleBy(i, 3) -> println("Fizz")
            divisibleBy(i, 5) -> println("Buzz")
            else -> println(i)
        }
    }
}

