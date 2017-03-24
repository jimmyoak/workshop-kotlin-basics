package io.jimmyoak.kotlinworkshop.exercises

/*
Make a class Order
Order has order lines
Order lines have product name, quantity and line total
Order has VAT of 21%
Order has total

I order a PS4 (299.95€), two DualShock 4 (59.95€),
a Resident Evil 7(69.95€) and a VR(399.95€)

Print lines and total
*/

fun main(args: Array<String>) {
    val order = Order()
    val orderLines = listOf(
            OrderLine(productName = "PS4", quantity = 1, price = 299.95),
            OrderLine(productName="DualShock 4", quantity = 2, price = 59.95),
            OrderLine(productName="Resident Evil 7", quantity = 1, price = 69.95),
            OrderLine(productName="VR", quantity = 1, price = 399.95)
    )
    orderLines.forEach { order.addOrderLine(it) }

    order.lines().forEach { println("Order line: ${it.productName} (${it.total()}€)") }
    println("Total: ${order.total()}€")
}

class OrderLine(val productName: String, val quantity: Int, val price: Double) {
    fun total() = price * quantity
}

class Order() {
    private val orderLines: MutableList<OrderLine> = mutableListOf()

    fun total() = orderLines.map {it.total()}.sum()

    fun addOrderLine(orderLine: OrderLine): Unit {
        orderLines.add(orderLine)
    }

    fun lines(): List<OrderLine> = orderLines
}
