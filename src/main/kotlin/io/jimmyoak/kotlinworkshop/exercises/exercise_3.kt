package io.jimmyoak.kotlinworkshop.exercises

/*
Make a class Order
Order has order lines
Order lines have product name, quantity and line total
Order has VAT of 21%
Order has total

I order a PS4 (300€), a Resident Evil 7(70€) and a VR(400€)

Print lines and total
*/

class Order {
    val VAT: Int = 21
    private val lines: MutableList<Line> = mutableListOf()

    fun addLine(line: Line) {
        lines += line
    }

    fun total() = lines.sumByDouble(Line::total)

    fun getLines(): List<Line> = lines
}

class Line(val name: String, val quantity: Int, val price: Double) {
    fun total(): Double = quantity.toDouble() * price
}

class OrderPrinter {
    fun print(order: Order) {
        println("Name\tQuantity\tTotal")

        order.getLines().forEach {
            println("${it.name}\t${it.quantity}\t${it.price}")
        }

        println("Total is ${order.total()} (VAT of ${order.VAT}% included)")
    }
}

fun main(args: Array<String>) {
    val order = Order()
    order.addLine(Line("Ps4", 1, 299.95))
    order.addLine(Line("Resident Evil 7", 1, 69.95))
    order.addLine(Line("VR", 1, 399.95))
    order.addLine(Line("Dual shock", 2, 59.95))

    OrderPrinter().print(order)
}