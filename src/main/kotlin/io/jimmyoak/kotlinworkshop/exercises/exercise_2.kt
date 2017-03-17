package io.jimmyoak.kotlinworkshop.exercises

/*

Write a program which converts data() into a string (ints to its ascii representation)

Write a program which converts data2() applying ROT-13 and outputs the result as a String (control only from A to Z)

Write a program which fins prime numbers between 0 and 50 and sums them

*/

fun data() = listOf(106, 105, 109, 109, 121)

fun main(args: Array<String>) {
    /*val numeros: List<Int> = data();

    numeros
            .map { it .toChar()}
            .forEach(::println)*/

   println((1..50)
            .filter(::isPrime).sum())
}

fun isPrime(number: Int) = (2 until number)
        .filter { number % it == 0 }
        .isEmpty()


//fun data2() = "WVZZL"
