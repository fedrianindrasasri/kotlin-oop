package app

import data.Car

fun main(){
//    cara memanggil object dan mengisi constructornya
    val avanza = Car("Toyota", "Avanza")
    val almaz = Car("Wuling", 2022, "Almaz")

    println(avanza.brand)
    println(avanza.year)
    println(almaz.brand)
    println(almaz.year)
}