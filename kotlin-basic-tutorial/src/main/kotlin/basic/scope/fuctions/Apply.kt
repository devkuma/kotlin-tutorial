package basic.scope.fuctions

import java.awt.Dimension
import javax.swing.JFrame

fun main() {

    println("== example 1 =========")

    val str = "devkuma".apply { uppercase() }
    println(str)


    println("== example 2 =========")

    val frame: JFrame = JFrame("My App").apply {
        size = Dimension(600, 400)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        setVisible(true)
    }

    println("== example 3 =========")

    val person1 = Person("kimkc").apply {
        age = 21
        city = "Seoul"
    }

    val person2 = Person("kimkc")
    person2.age = 21
    person2.city = "Seoul"

    println(person1 == person2)
}

data class Person(val name: String) {
    var age: Int? = null
    var city: String? = null
}