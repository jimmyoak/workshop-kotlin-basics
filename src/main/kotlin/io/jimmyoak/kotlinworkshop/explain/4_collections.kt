package io.jimmyoak.kotlinworkshop.explain

fun main(args: Array<String>) {
    val numbers: List<Int> = listOf(1, 2, 3)
    val moreNumbers: List<Int> = numbers + listOf(4, 5)
    val moarNumbers: List<Int> = moreNumbers + 6

    println(numbers)
    println(moreNumbers)
    println(moarNumbers)

    val chars: MutableList<Char> = mutableListOf('a', 'b', 'c')
    chars.add('d')
    chars.add('e')

    //val unmodifiableChars: List<Char> = chars
    //unmodifiableChars.add('f') add method here does not exist

    println(chars)

    val numbersAndRepresentation: Map<Int, String> = mapOf(
            1 to "one",
            2 to "two",
            3 to "three",
            4 to "four",
            5 to "five",
            6 to "six"
    )
    println(numbersAndRepresentation)
    println(numbersAndRepresentation[1])

    val anotherThing = setOf(1, 2, 2, 2, 3, 4, 4, 5)
    println(anotherThing)

    moarNumbers
            .map(numbersAndRepresentation::get)
            .map { it!!.toUpperCase() }
            .forEach(::println)
}
