package basic.collections.map

fun main() {
    val map: Map<String, Int> = mapOf("A" to 1, "B" to 2, "C" to 3)
    println(map["A"])

    // 루프 처리(forEach 함수도 가능)
    for ((k, v) in map) {
        println("$k -> $v")
    }
}