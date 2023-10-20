package app

import data.Student

fun main() {
    val student = Student("Fedrian", 20)
    student.let {
        println(it.name)
        println(it.age)
    }

    val result2: String = student.run {
        "Name ${this.name} Age ${this.age}"
    }
    println(result2)

    val result3: Student = student.apply {
        "Name ${this.name} Age ${this.age}"
    }
    println(result3)

    student.also {
        println(it.name)
        println(it.age)
    }

    val result4: String = with(student) {
        "Name ${this.name} Age ${this.age}"
    }
    println(result4)
}