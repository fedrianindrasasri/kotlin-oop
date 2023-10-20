package app

import data.Person

fun main() {
    val fedrian = Person("","","")
    fedrian.firstName = "Fedrian"

    fedrian.sayHello("Indra")
    fedrian.sayHello("Indra", "Sasri")

}