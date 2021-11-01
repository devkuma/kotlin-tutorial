package basic.classes.delegation

interface Base {
    fun funcA()
    fun funcB()
}

class BaseImpl : Base {
    override fun funcA() {
        println("AAA")
    }

    override fun funcB() {
        println("BBB")
    }
}

class BaseImplEx(b: Base) : Base by b {
    override fun funcA() {
        println("AAA!!!")
    }
}

fun main() {
    println("== BaseImpl ====")
    val b = BaseImpl()
    b.funcA()
    b.funcB()

    println("== BaseImplEx ====")
    val bx = BaseImplEx(b)
    bx.funcA()
    bx.funcB()
}