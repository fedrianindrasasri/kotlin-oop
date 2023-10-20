package app

import data.Student
import data.sayHello
import data.upperName


fun main(){
    val student = Student("Fedrian", 25)
    student.sayHello("Indra")
    println(student?.upperName)
}