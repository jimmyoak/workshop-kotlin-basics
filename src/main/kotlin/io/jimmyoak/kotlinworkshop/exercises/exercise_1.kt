package io.jimmyoak.kotlinworkshop.exercises


fun main(args: Array<String>) {

    fun fizzBuzz(x: Int): Any {
        if (x % 3 == 0) {
            return "Fizz"
        }
        if ( x % 5 == 0 ) {
            return "Buzz"
        }
        if (x % 3 == 0 && x % 5 == 0) {
            return "FizzBuzz"
        }
        return x
    }

    for (i in 1..100) println(fizzBuzz(i))


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