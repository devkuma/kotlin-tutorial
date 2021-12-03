package basic.classes

open class Foo {
    open fun print() {
        println("Foo")
    }
}

class Bar() : Foo() {
    override fun print() {
        println("Bar")
    }
}

fun main() {
    var bar = Bar()
    bar.print()
}
