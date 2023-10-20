package data

open class Employee(val name: String) {
    open fun sayHello(name: String) {
        println("Hello $name, My Name is ${this.name}")
    }
}

class Manager(name: String) : Employee(name){
    final override fun sayHello(name: String) {
        println("Hello $name, My Name is Manager ${this.name}")
    }
}
class VicePrecident(name: String) : Employee(name){
    override fun sayHello(name: String) {
        println("Hello $name, My Name is Vice Precident ${this.name}")
    }
}

