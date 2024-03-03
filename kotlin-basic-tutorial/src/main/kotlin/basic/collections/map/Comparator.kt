package basic.collections.map

fun main() {
    val map = mapOf("AAA" to 3, "BBB" to 1, "CCC" to 2)
    val map2 = map.toSortedMap { k1, k2 ->
        map[k1]!! - map[k2]!!
    }
    map2.forEach { (k, v) -> println("$k, $v") }
}