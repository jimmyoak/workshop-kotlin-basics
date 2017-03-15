package io.jimmyoak.kotlinworkshop.explain

interface Talker {
    fun talk(): String
}

interface SomeInterfaceWithImplementation {
    private fun doSomething() = println("I do something")
    fun boo() = println("Boo")
}

abstract class Animal(val specie: String) : Talker, SomeInterfaceWithImplementation {
    companion object {
        fun create(specie: String): Animal = when (specie.toLowerCase()) {
            "cat" -> Cat()
            "dog" -> Dog()
            "doge" -> Doge()
            else -> throw Exception("Unknown specie")
        }
    }
}

class Cat : Animal("Cat") {
    override fun talk() = "Meow"
}

open class Dog : Animal("Dog") {
    override fun talk() = "Woof"

}

class Doge : Dog() {
    override fun talk() = "Wow!"
}

fun main(args: Array<String>) {
    val animals: List<Animal> = listOf(
            Animal.create("Cat"),
            Animal.create("Dog"),
            Animal.create("Doge")
    )

    animals.map(Animal::talk).forEach(::println)
}