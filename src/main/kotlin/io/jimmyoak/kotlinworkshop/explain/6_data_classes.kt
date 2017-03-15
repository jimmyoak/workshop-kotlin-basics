package io.jimmyoak.kotlinworkshop.explain

data class Name(val value: String)
data class Age(val value: Int)
enum class Sex {
    MALE,
    FEMALE
}

abstract class Person(val name: Name, val age: Age, val sex: Sex)
class Man(name: Name, age: Age) : Person(name, age, Sex.MALE)
class Woman(name: Name, age: Age) : Person(name, age, Sex.FEMALE)

data class Money(val amount: Double, val currency: String) {
    operator fun plus(money: Money) = if (this.currency == money.currency) this.copy(amount = this.amount + money.amount) else throw Exception("Moneys must be the same currency")
}

fun main(args: Array<String>) {
    val jimmy = Man(Name("Jimmy"), Age(24))
    val fallon = Man(Name("Jimmy Fallon"), Age(24))
    val caroline = Woman(Name("Caroline"), Age(21))

    println("${jimmy.name.value} and ${fallon.name.value} have the same age? " + if (jimmy.age == fallon.age) "Yes" else "No")
    println("${jimmy.name.value} and ${caroline.name.value} have the same age? " + if (jimmy.age == caroline.age) "Yes" else "No")

    val a = Money(5.5, "EUR")
    val b = Money(3.4, "EUR")
    val total = a + b
    println(total)
}