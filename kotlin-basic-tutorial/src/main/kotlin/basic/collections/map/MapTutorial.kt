package basic.collections

fun main() {
    var map = mapOf("Red" to "#f00", "Green" to "#0f0", "Blue" to "#00f")

    println(map["Red"])

    for ((key, value) in map) {
        println("$key = $value")
    }
}