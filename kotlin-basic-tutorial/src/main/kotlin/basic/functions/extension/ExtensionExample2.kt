package basic.functions.extension

class Example2 {
    fun printFunctionType() { println("Class method") }
}

fun Example2.printFunctionType(i: Int) { println("Extension function #$i") }

fun main() {
    Example2().printFunctionType(1)
}

