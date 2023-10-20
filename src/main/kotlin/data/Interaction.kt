package data

interface Interaction {
    val name:String
    fun sayHello(name:String):Unit{
        println("Hello $name, My Name is ${this.name}")
    }
}

interface Go:Interaction{
    fun go(){
        println("Go!")
    }
}

interface MoveA{
    fun move() = println("Move A")
}

interface MoveB{
    fun move() = println("Move B")
}

class Human(override val name:String):Go, MoveA, MoveB{
//    cara menulis funciton yang sama di dua interface
    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
    }
}