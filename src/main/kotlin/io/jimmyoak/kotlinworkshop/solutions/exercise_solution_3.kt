package io.jimmyoak.kotlinworkshop.solutions

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
    private val lines: MutableList<OrderLine> = mutableListOf()

    fun addOrderLine(product: String, quantity: Int, price: Double) = lines.add(OrderLine(product, quantity, price))

    fun lines(): List<OrderLine> = lines

    fun total() = lines.map(OrderLine::total).sum()
}

class OrderLine(val product: String, val quantity: Int, val price: Double) {
    fun total() = quantity * price
}

object OrderPrinter {
    fun print(order: Order) {
        printLine("Product", "Quantity", "Price", "Total")
        println("-".repeat(60))
        order.lines().forEach(OrderPrinter::printLine)
        println("Total: ${order.total().toString().padStart(52)}")
    }

    private fun printLine(orderLine: OrderLine) {
        printLine(orderLine.product, orderLine.quantity.toString(), orderLine.price.toString(), orderLine.total().toString())
    }

    private fun printLine(product: String, quantity: String, price: String, total: String) {
        println("${product.padEnd(20)} | ${quantity.padStart(10)} | ${price.padStart(10)} | ${total.padStart(10)}")
    }
}

fun main(args: Array<String>) {
    val order = Order()
    order.addOrderLine("PS4", 1, 299.95)
    order.addOrderLine("DualShock 4", 2, 59.95)
    order.addOrderLine("Resident Evil 7", 1, 69.95)
    order.addOrderLine("VR", 1, 399.95)

    OrderPrinter.print(order)
}
