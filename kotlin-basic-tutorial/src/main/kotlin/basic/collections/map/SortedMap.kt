package basic.collections.map

fun main() {
    val map = mapOf("C" to 3, "A" to 1, "B" to 2)
    for ((k, v) in map.toSortedMap()) {
        println("$k -> $v")
    }
}