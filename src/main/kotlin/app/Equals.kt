package app

import data.Company

fun main() {
    val company1 = Company("Fedrian")
    val company2 = Company("Fedrian")

    println(company1 == company2)
}