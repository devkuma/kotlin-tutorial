package sample.list

fun main() {
    val list = listOf('a', 'A', 'b', 'B', 'c', 'A', 'a', 'C')

    println(list.distinct())
    println(list.distinctBy { it.uppercaseChar() })
}
