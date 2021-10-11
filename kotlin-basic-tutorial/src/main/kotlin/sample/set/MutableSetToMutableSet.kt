package sample.set

fun main() {
    val set = mutableSetOf(1, 2, 3, 4, 5)

    val list = set.toMutableList()
    list.add(6)

    println(list)
}