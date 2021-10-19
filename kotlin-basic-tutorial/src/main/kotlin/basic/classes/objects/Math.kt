package basic.classes.objects

class Math {
    companion object {
        fun add(a: Int, b: Int) = a + b
    }
}

fun main() {
    println(Math.add(3, 5))
}