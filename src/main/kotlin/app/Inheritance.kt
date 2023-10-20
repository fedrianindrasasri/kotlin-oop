package app

import data.Manager
import data.VicePrecident

fun main() {
    val manager = Manager("Fedrian")
    manager.sayHello("Indra")

    val vicePrecident = VicePrecident("Fedrian")
    vicePrecident.sayHello("Sasri")
}