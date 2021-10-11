package sample

fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)

    val set = list.toMutableSet()
    set.add(6)

    println(set)
}