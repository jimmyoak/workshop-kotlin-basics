package io.jimmyoak.kotlinworkshop.explain

val name: String = "Jimmy"
val salute = "Hello $name from Kotlin!"

fun say(saying: String) = println(saying)

fun doNotSay(saying: String?): Unit {
    val dontSaying = "I cannot say \"${(saying ?: "?¿?¿").capitalize()}\""
    println(dontSaying)
}

fun doNotSay(): Unit = doNotSay(null)

fun main(args: Array<String>) {
    say(salute)
    doNotSay("bye!")
    doNotSay()

    var x = 3
    println(x)
    x += 2
    println(x)

    val anotherSaying = if (x == 5) "It was five! That's awesome!" else "It was not five :("

    say(anotherSaying)

    val longText = """
    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis dui metus, mattis ut leo nec, condimentum iaculis neque. Fusce tempus quis
    turpis in rhoncus. Pellentesque faucibus, lectus euismod feugiat suscipit, elit purus pulvinar libero, et porta libero sem in ligula.
    Morbi efficitur massa ut leo gravida feugiat. Proin vitae mi eget turpis venenatis maximus. Mauris nec purus sit amet metus maximus
    dignissim non in ex. Sed et lectus in ipsum posuere malesuada. Phasellus a dolor molestie, sagittis mi quis, imperdiet sem.
    Ut congue dolor nisl, ac malesuada velit elementum vel. Vestibulum tincidunt vel leo quis fringilla.
    """
    val anotherLongText = """
        |Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis dui metus, mattis ut leo nec, condimentum iaculis neque. Fusce tempus quis
        |turpis in rhoncus. Pellentesque faucibus, lectus euismod feugiat suscipit, elit purus pulvinar libero, et porta libero sem in ligula.
        |Morbi efficitur massa ut leo gravida feugiat. Proin vitae mi eget turpis venenatis maximus. Mauris nec purus sit amet metus maximus
        |dignissim non in ex. Sed et lectus in ipsum posuere malesuada. Phasellus a dolor molestie, sagittis mi quis, imperdiet sem.
        |Ut congue dolor nisl, ac malesuada velit elementum vel. Vestibulum tincidunt vel leo quis fringilla.
    """.trimMargin()

    println(longText)
    println(anotherLongText)
}
