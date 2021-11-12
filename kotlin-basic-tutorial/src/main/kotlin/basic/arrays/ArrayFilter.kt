package basic.arrays

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5) // => 1,2,3,4,5 배열을 생성한다.

    // filter의 조건에 충족되는 함수를 반환한다.
    array.filter({ e -> e % 2 == 0 }).forEach { print("$it,") } // => 2,4
    println()

    // 괄호'（）'은 생략할 수 있다.
    array.filter { e -> e % 2 == 0 }.forEach { print("$it,") } // => 2,4
    println()

    // lambda 사용하지 않고도 'it'으로 객체를 받아 올 수 이 있다.
    array.filter { it % 2 == 0 }.forEach { print("$it,") } // => 2,4
}