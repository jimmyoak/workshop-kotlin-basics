package io.jimmyoak.kotlinworkshop.exercises


fun main(vararg args: String) {
   printNumbers(1, 101)
}

fun printNumbers(initialNumber: Int, endNumber: Int){
    for (i in initialNumber until endNumber) {
        println(i)
        when (isDivisible(i)) {
            3 -> println("Fizz")
            5 -> println("Fizz")
            3 -> println("Fizz")
        }

        /*when (i) {
            2 -> println("Fizz")
            4 -> {
                println("Buzz")
                println("Fizz")
            }
            8 -> {
                println("Fizz")
                println("Buzz")
            }
            11 -> println("Fizz")
            14 -> println("FizzBuzz")
            17 -> println("Fizz")
            19 -> println("Buzz")
            else -> ""
        }*/
    }
}

fun isDivisible(number: Int): Int{
    return 3;
}

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