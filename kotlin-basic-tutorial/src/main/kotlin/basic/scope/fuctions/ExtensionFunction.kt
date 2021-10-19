package basic.scope.fuctions

fun main() {
    // 확장 함수 정의
    fun String.lastChar(): Char = this[this.length - 1]

    // 확장 함수 사용
    val last: Char = "hello".lastChar()
    println(last)
}