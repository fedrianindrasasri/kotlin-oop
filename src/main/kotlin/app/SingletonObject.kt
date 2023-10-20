package app

import data.Application
import data.Utility

fun main() {
    println(Utility.name)
    println(Utility.toUpper("fedrian"))

    println(Application.Companion.toUpper("Fedrian"))
    println(Application.toUpper("Fedrian"))
}