package basic.first.classs.functions

fun main() {
    val hello: () -> String = { "Hello world!" }

    println(hello())
}
