package io.jimmyoak.kotlinworkshop.exercises

import com.sun.org.apache.xpath.internal.operations.Or

/*
Make a class Order
Order has order lines
Order lines have product name, quantity and line total
Order has VAT of 21%
Order has total

I order a PS4 (300€), a Resident Evil 7(70€) and a VR(400€)

Print lines and total
*/

class OrderLine(var productName: String, var quantity: Int, var price: Double)

class Orders{
    val orderList: MutableList<OrderLine> = null!!

    fun addOrderLine(order: OrderLine) {
        orderList.add(order)
    }
}

fun main(args: Array<String>) {
    var vat: Double = 0.21
    var totalOrdersPrice: Double = 0.00
    var totalVAT: Double

    var myOrders: Orders = Orders()
    myOrders.addOrderLine(OrderLine("PS4", 1, 299.95))
    myOrders.addOrderLine(OrderLine("Resident Evil", 1, 69.95))
    myOrders.addOrderLine(OrderLine("DualShock 4", 2, 59.95))
    myOrders.addOrderLine(OrderLine("VR", 1, 399.95))


    myOrders.orderList
        .forEach{
            totalOrdersPrice += it.price * it.quantity
            println(it.productName + " - " + it.price)
        }

    totalVAT = totalOrdersPrice * vat
    println("Total without VAT: " + (totalOrdersPrice))
    println("Total with VAT: " + (totalOrdersPrice - totalVAT))

}
