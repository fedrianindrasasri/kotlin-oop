package app

import data.User

fun main() {
    val user1 = User("Fedrian","password1")
    val user2 = User("Indra","password2")

    println(user1.userName)
    println(user1.password)
    println(user2.userName)
    println(user2.password)
}