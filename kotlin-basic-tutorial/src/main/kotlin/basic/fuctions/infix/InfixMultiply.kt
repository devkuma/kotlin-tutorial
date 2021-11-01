package basic.fuctions.infix

/**
 * infix로 선언된 중위 함수
 *
 * Int를 확장하여 multiply() 함수가 추가하였다.
 */
infix fun Int.multiply(x: Int): Int {
    return this * x
}

fun main() {
    // 일반 표현법
    val multiply1 = 3.multiply(10)
    println("multiply1: $multiply1")

    // 중위 표현법
    val multiply2 = 3 multiply 10
    println("multiply2: $multiply2")
}
