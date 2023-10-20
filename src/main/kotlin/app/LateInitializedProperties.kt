package app

import data.Television

fun main() {
    val television=Television()

    television.initTelevision("Samsung")
    println(television.brand)

}