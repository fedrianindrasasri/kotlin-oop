package app

import data.Person

fun main() {
    val fedrian = Person("Fedrian","Indra","Sasri")

    fedrian.firstName = "Fedrian"
    fedrian.middleName = "Indra"
    fedrian.lastName = "Sasri"

    fedrian.sayHello("Fadil")
    fedrian.run()
    val fullName = fedrian.getFullName()
    println(fullName)

}