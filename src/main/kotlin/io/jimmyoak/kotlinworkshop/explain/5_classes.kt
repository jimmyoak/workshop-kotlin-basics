package io.jimmyoak.kotlinworkshop.explain

interface Shape
class Circle(val radius: Int) : Shape
class Square(val size: Int) : Shape
class Rectangle(val width: Int, val height: Int) : Shape

fun main(args: Array<String>) {
    val squares: List<Square> = listOf(Square(1), Square(2))
    val circles: List<Circle> = listOf(Circle(1))
    val rectangles: List<Rectangle> = listOf(Rectangle(1, 2), Rectangle(3, 4))

    val shapes: List<Shape> = squares + circles + rectangles

    shapes.map {
        when(it) {
            is Square -> "Square of size: ${it.size}"
            is Circle -> "Circle of radius: ${it.radius}"
            is Rectangle -> "Rectangle of ${it.width}x${it.height}"
            else -> "Unknown shape ${it::class.simpleName}"
        }
    }.forEach(::println)
}