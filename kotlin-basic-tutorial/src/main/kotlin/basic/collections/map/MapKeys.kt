package basic.collections.map


fun main() {
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    val updatedMap = map.mapKeys { it.key.uppercase() }
    println(updatedMap)
}