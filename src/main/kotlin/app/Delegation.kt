package app

import data.Delegate
import data.MyBase


fun main() {
    val base = MyBase()
    base.sayHello("Fedrian")

    val baseDelegate = Delegate(base)
    baseDelegate.sayHello("Indra")
}