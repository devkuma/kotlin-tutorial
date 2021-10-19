package basic.scope.fuctions

import java.awt.Dimension
import javax.swing.JFrame

fun main() {
    println("== example 1 =========")

    val str = with("devkuma") { this.uppercase() }
    println(str)

    println("== example 2 =========")

    val frame: JFrame = with(JFrame("My App")) {
        size = Dimension(600, 400)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        setVisible(true)
        this
    }

    println("== example 3 =========")

    val numbers = mutableListOf("one", "two", "three")
    with(numbers) {
        println("'with' is called with argument $this")
        println("It contains $size elements")
    }
}