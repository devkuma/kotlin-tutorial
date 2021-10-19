package basic.classes.interfaces

interface A {
    fun foo() { println("A") }
    fun bar() // abstract
}

interface B {
    fun foo() { println("B") }
    fun bar() { println("bar") }
}

class C : A {
    override fun bar() { println("bar") }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}

fun main() {
    val c = C()
    c.foo()
    c.bar()

    println()

    val d = D()
    d.foo()
    d.bar()
}