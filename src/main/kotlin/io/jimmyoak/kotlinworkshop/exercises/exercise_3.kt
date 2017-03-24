package io.jimmyoak.kotlinworkshop.exercises

/*
Make a class Order
Order has order lines
Order lines have product name, quantity and line total
Order has VAT of 21%
Order has total

I order a PS4 (299.95), two dualshock (59.95) a Resident Evil 7(69.95€) and a VR(400€)

Print lines and total
*/


class Order (var orderLines: MutableList<OrderLine>) {
    val VAT: Double = 21.0

    fun getAmount(): Double {
        var amount: Double = 0.0
        orderLines.forEach { line ->
            run {
                amount += line.quantity * line.total
            }
        }
        return amount * VAT
    }

}

class OrderLine(val name: String, val quantity: Int, val total: Double)

class OrderPrinter(val orderLines: MutableList<OrderLine>, val amount: Double ) {

    fun printOrder() {
        println("------------------------------")
        orderLines.forEach { orderLine ->
            run {
                println(orderLine.name + "\t\t\t|\t\t\t" + orderLine.quantity + "\t\t\t|\t\t\t" + orderLine.total)
            }
        }
        println("TOTAL: \t\t\t" + amount.toString())
        println("-----------------")
    }
}

fun main(args: Array<String>) {

    val orderLine = OrderLine("PS4", 1, 299.95)
    val orderLine1 = OrderLine("Dualshock", 2, 59.95)
    val orderLine2 = OrderLine("Residen Evil 7", 1, 69.95)
    val orderLine3 = OrderLine("VR", 1, 400.0)

    val order = Order(mutableListOf(orderLine, orderLine1, orderLine2, orderLine3))

    OrderPrinter(order.orderLines, order.getAmount()).printOrder()
}
