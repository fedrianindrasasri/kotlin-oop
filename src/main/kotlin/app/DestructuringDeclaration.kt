package app

import data.Game
import data.Login
import data.MinMax

fun minMax(value1:Int, value2:Int):MinMax{
    return when{
        value1>value2->MinMax(value2,value1)
        else -> MinMax(value1,value2)
    }
}

fun login(login: Login, callback:(Login)->Boolean):Boolean{
    return callback(login)
}

fun main() {
    val game = Game("Valorant", 20_000)
    val (name, price) = game
    println(name)
    println(price)

    val(min,_) = minMax(10,100)
    println(min)
//    println(max)

    val login = Login("Fedrian","Rahasia")
    login(login){
        (username, password)->
        username=="fedrian"&&password=="rahasia"
    }
}