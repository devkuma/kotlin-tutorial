package basic.arrays

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)

    // lambda으로 사용한 방법이다.
    array.forEach({ element ->
        print("$element,")
    }) // => 1,2,3,4,5
    println()

    // 괄호'（）'은 생략할 수 있다.
    array.forEach { element ->
        print("$element,")
    }
    println()

    // it으로 람다를 대신하여 객체를 받아올 수 있다.
    array.forEach {
        print("$it,")
    } // => 1,2,3,4,5
}