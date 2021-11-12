package basic.arrays

// 이름과 연령을 갖는 클래스 정의
private class Person(val name: String, val age: Int)

fun main() {
    val array = arrayOf(
        Person("Charlie", 20),
        Person("devkuma", 31),
        Person("kimkc", 42),
    )

    // lambda으로 user 인스턴스를 받아 올수 있다.
    array.map({ user -> user.name }).forEach { print("$it,") }
    println()

    // 괄호'（）'은 생략할 수 있다.
    array.map { user -> user.name }.forEach { print("$it,") }
    println()

    // 'it'으로 객체를 받아 올 수 있다(이 'it'는 user 인스턴스를 가르킨다).
    array.map { it.name }.forEach { print("$it,") }
}


