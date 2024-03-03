package basic.collections.map

fun main() {
    val map = mutableMapOf<String, Int>()
    println(map["foo"])                     // null (값이 존재하지 않음)
    println(map.getOrPut("foo") { 0 }) // 0 (get과 동시에 초기값이 설정됨)
    println(map["foo"])                     // 0 (값이 설정되어 있음)
}