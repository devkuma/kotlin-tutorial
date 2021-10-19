package basic.scope.fuctions

import java.awt.Dimension
import javax.swing.JFrame

fun main() {

    println("== example 1 =========")

    val str = "devkuma".run { uppercase() }
    println(str)


    println("== example 2 =========")

    val numbers = mutableListOf("one", "two", "three")
    val countEndsWithE = numbers.run {
        add("four")
        add("five")
        count { it.endsWith("e") }
    }
    println("numbers: $numbers")
    println("There are $countEndsWithE elements that end with e.")

    println("== example 23 =========")

    val frame: JFrame? = frameOrNull()
    frame?.run {
        size = Dimension(600, 400)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        setVisible(true)
    }
}

fun frameOrNull(): JFrame? {
    // return null
    return JFrame("My App")
}