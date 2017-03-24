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

class Order(var productName: String, var quantity: Int, var price: Double)

fun main(args: Array<String>) {

    var orderPS4: Order = Order("PS4", 1, 300.00)
    var orderResident: Order = Order("Resident Evil", 1, 70.00)
    var orderVR: Order = Order("VR", 1, 400.00)

    val orders: List<Order> = listOf(orderPS4, orderResident, orderVR)
    var totalOrders: Double = 0.00;

    orders
            .forEach{
                totalOrders += it.price
                println(it.productName + " - " + it.price.toString())
            }

            println("Total: " + totalOrders)

}
