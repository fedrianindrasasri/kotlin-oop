package data

open class Shape {
    open var corner:Int = -1

    open fun printName(){
        println("This is Shape")
    }
}

class Rectangle:Shape(){
    override var corner: Int = 4
    val parentCorner:Int = super.corner
    override fun printName(){
        println("This is Rectangle")
        super.printName()
    }
}

class Triangle:Shape(){
    override var corner: Int = 3
}