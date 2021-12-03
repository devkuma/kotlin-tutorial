package basic.classes

open class Animal {
    fun running() {
        println("running")
    }
}

class Cat : Animal() {
    fun sound() {
        println("sound")
    }
}

fun main() {
    val cat = Cat()
    cat.running()
    cat.sound()
}
