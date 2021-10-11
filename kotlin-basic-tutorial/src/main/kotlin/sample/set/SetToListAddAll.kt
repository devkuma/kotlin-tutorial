package sample.set

fun main() {
    val set = setOf(1, 2, 3, 4, 5)

    val list: MutableList<Int> = ArrayList()
    list.addAll(set)

    println(list)
}