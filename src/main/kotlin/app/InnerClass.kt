package app

import data.Boss

fun main() {
    val fedrian = Boss("Fedrian")
    val indra = fedrian.Employee("Indra")

    indra.hi()
}