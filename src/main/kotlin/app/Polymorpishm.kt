package app

import data.Employee
import data.Manager

fun main() {
    var employee: Employee = Employee("Fedrian")
    employee.sayHello("Indra")


    employee = Manager("Sasri")
    employee.sayHello("Fedrian")
}