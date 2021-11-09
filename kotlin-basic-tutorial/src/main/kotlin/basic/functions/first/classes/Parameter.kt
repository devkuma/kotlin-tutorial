package basic.first.classs.functions

fun printlnFunc(func: () -> String) {
    println("${func()}")
}

fun main() {
    val hello: () -> String = { "Hello world!" }

    printlnFunc(hello)
}