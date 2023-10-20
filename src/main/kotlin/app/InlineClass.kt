package app

import data.Token

fun main() {
    val token = Token("Ini Value")
    println(token.value)
    println(token.toUpper())
}