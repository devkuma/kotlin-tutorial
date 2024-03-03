package basic.collections.map

fun main() {
    val map: MutableMap<String, Int> = mutableMapOf("A" to 1, "B" to 2, "C" to 3)
    map["A"] = 5
    map["D"] = 10
    for ((key, value) in map) {
        println("$key -> $value")
    }
}