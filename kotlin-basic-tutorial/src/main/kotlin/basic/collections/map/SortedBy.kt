package basic.collections.map

fun main() {
    val map = mapOf("A" to 3, "B" to 1, "C" to 2)
    val pairs = map.toList().sortedBy { it.second }
    pairs.forEach { (k, v) -> println("$k, $v") }
}