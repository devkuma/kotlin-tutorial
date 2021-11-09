package basic.functions.extension

class Example {
    fun printFunctionType() { println("Class method") }
}

fun Example.printFunctionType() { println("Extension function") }

fun main() {
    Example().printFunctionType()
}
