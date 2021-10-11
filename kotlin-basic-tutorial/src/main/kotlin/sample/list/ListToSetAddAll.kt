package sample.list

fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    val set: MutableSet<Int> = HashSet()
    set.addAll(list)

    println(set)
}