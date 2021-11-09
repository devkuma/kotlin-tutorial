package basic.functions.inline

inline fun calc2(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    println("called calc function")
    return op(a, b)
}

fun main() {
    var result = calc2(2, 3) { a: Int, b: Int -> a + b }
    println(result)
}