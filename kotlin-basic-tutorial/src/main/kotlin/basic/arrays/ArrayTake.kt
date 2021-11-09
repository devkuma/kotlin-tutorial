package basic.arrays

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)
    array.take(1).forEach { print(it) } // => 1
    println()
    array.take(2).forEach { print(it) } // => 1, 2
    println()
    array.take(3).forEach { print(it) } // => 1, 2, 3
    println()
    array.take(4).forEach { print(it) } // => 1, 2, 3, 4
    println()
    array.take(5).forEach { print(it) } // => 1, 2, 3, 4, 5
}