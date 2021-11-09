package basic.arrays

fun main() {
    val evenNumbers = Array(10) { it * 2 }

    for (n in evenNumbers) {
        println(n)
    }
}