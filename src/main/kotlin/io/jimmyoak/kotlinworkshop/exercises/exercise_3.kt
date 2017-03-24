package io.jimmyoak.kotlinworkshop.exercises

/*
Make a class Order
Order has order lines
Order lines have product name, quantity and line total
Order has VAT of 21%
Order has total

I order a PS4 (299.95), two DualShock 4 (59.95€), a Resident Evil 7(69.95€) and a VR(399.95€)

Print lines and total
*/

class Order private constructor (val vat: Double, val total: Double, val orderLines: List<OrderLine>) {

    constructor(orderLines: List<OrderLine>): this(21.0, orderLines.sumByDouble { it.totalLine() }, orderLines)

}
class OrderLine(val name: String, val quantity: Int, val unitPrice: Double) {
    fun totalLine(): Double {
        return quantity.toDouble() * unitPrice
    }
}

fun printt(orderline: OrderLine): Unit {
    println("${orderline.name}, ${orderline.quantity}, ${orderline.totalLine()}")
}

fun printOrder(order: Order): Unit {
    order.orderLines.forEach(::printt)
    println(order.total)
}

fun main(args: Array<String>) {

    var ps4 = OrderLine("PS4", 1, 299.95)
    var dualshock = OrderLine("DualShock 4", 2, 59.95)
    var resident = OrderLine("PS4", 1, 69.95)
    var vr = OrderLine("VR", 1, 399.95)

    var order = Order(listOf<OrderLine>(ps4, dualshock, resident, vr))

    printOrder(order)
}