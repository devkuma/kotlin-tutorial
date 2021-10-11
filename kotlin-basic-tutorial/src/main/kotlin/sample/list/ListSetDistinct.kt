package sample.list

fun main() {
    val list = listOf('a', 'b', 'c', 'a', 'c')

    val set = list.toSet()

    val newList = set.toList()

    println(newList)
}