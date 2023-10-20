package app

import data.Teacher

fun main() {
//    beberapa visibility modifier
//    public, private, protected, and internal
    val teacher = Teacher("Fedrian")
    println(teacher.name)
    println(teacher.teach())
}