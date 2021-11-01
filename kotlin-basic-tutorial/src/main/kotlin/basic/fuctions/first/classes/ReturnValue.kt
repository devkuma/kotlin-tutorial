package basic.first.classs.functions

fun getFunc(): () -> String {
    return { "Hello world!" }
}

fun main() {
    val returned: () -> String = getFunc()

    println("${returned()}")
}