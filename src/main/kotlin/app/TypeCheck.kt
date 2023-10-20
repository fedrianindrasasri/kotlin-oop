package app

import data.HandPhone
import data.Laptop

fun main() {
    printObject("Fedrian")
    printObject(1)
    printObject(Laptop("Acer"))
    printObject(HandPhone("Xiaomi"))
}

fun printObject(any:Any){
//    if (any is Laptop){
//        println("Laptop ${any.name}")
//    }else if(any is HandPhone){
//        println("HandPhone ${any.name}")
//    }else{
//        println(any)
//    }

    when (any) {
        is Laptop -> {
            println("Laptop ${any.name}")
        }
        is HandPhone -> {
            println("HandPhone ${any.name}")
        }
        else -> {
            println(any)
        }
    }
}