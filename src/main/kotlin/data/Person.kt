package data

class Person(firstNameParam: String, middleNameParam: String?, lastNameParam: String) {
    var firstName: String = firstNameParam
    var middleName: String? = middleNameParam
    var lastName: String = lastNameParam

    fun sayHello(name:String){
        println("Hello $name, My Name Is $firstName")
    }

    fun sayHello(firstName:String, lastName:String){
        println("Hello $firstName $lastName, My Name Is ${this.firstName}")
    }

    fun run(){
        println("I'm Run")
    }

    fun getFullName():String{
        return "$firstName $middleName $lastName"
    }
}

