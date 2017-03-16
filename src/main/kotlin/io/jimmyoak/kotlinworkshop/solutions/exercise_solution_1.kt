package io.jimmyoak.kotlinworkshop.solutions

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

fun fizzbuzz(number: Int) = when {
    number % 15 == 0 -> "FizzBuzz"
    number % 3 == 0 -> "Fizz"
    number % 5 == 0 -> "Buzz"
    else -> "$number"
}

fun main(args: Array<String>) = (0..100).map(::fizzbuzz).forEach(::println)
