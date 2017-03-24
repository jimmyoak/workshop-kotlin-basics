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

    var vat: Double = 0.21
    var totalOrdersPrice: Double = 0.00;
    var totalOrdersPriceVat: Double = 0.00;

    var orderPS4: Order = Order("PS4", 1, 299.95)
    var orderResident: Order = Order("Resident Evil", 1, 69.95)
    var dualShock: Order = Order("DualShock 4", 2, 59.95)
    var orderVR: Order = Order("VR", 1, 399.95)


    val orders: List<Order> = listOf(orderPS4, dualShock, orderResident, orderVR)

    orders
            .forEach{
                totalOrdersPrice += it.price * it.quantity
                println(it.productName + " - " + it.price)
            }

    totalOrdersPriceVat = totalOrdersPrice * vat
    println("Total: " + (totalOrdersPrice - totalOrdersPriceVat))


}
