package app

import data.ExcutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Fedrian")
    println(premiumCustomer.name)

    val executiveCustomer = ExcutiveCustomer("Indra", 10_000_000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}