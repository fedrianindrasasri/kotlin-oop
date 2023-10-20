package app

import data.Rectangle
import data.Shape
import data.Triangle


fun main() {
    val shape = Shape()
    println(shape.corner)

    val shape2 = Rectangle()
    println(shape2.parentCorner)
    println(shape2.corner)
    shape2.printName()

    val shape3 = Triangle()
    println(shape3.corner)
}