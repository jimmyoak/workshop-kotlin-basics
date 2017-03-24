package io.jimmyoak.kotlinworkshop.exercises

/*
Make a class Order
Order has order lines
Order lines have product name, quantity and line getTotal
Order has VAT of 21%
Order has getTotal

I order a PS4 (300€), a Resident Evil 7(70€) and a VR(400€)

Print lines and getTotal
*/
class Game (val name: String, val price: Double)
class OrderLine (val game: Game, val quantity: Int){
    fun getTotal() : Double = game.price * quantity
}
class Order{
    private val Vat = 0.21
    private val orderLines = mutableListOf<OrderLine>()
    fun getOrderLines() : List<OrderLine>  = orderLines
    fun addOrderLine(orderLine : OrderLine) = orderLines.add(orderLine)
    fun getTotal() : Double {
        var total = 0.0
        for (orderLine in orderLines) {
            total += orderLine.getTotal()
        }
        return total
    }
}
object PrinterLine{
    fun printLine(orderLine: OrderLine) = "${orderLine.game.name} ${orderLine.game.price} ${orderLine.quantity} ${orderLine.getTotal()}"
}
fun main(args: Array<String>) {
    var order = Order()

    order.addOrderLine(OrderLine(Game("PS4",299.95),1))
    order.addOrderLine(OrderLine(Game("DualShock 4",59.95),2))
    order.addOrderLine(OrderLine(Game("Resident Evil 7",69.95),1))
    order.addOrderLine(OrderLine(Game("VR",399.95),1))

    println(order.getOrderLines()
            .map {
                PrinterLine.printLine(it)
            }
            .joinToString("\n"))


}
