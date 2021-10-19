package basic.scope.fuctions

fun main() {

    println("== example 1 =========")

    val str = "devkuma".let { it.uppercase() }
    println(str)


    println("== example 2 =========")

    var foo: String? = null
    // var foo: String = "foo"
    val upperCase: String? = foo?.let { it.uppercase() }
}