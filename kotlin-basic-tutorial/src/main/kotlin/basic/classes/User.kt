package basic.classes

class User {
    var id: Long = 0

    var name: String = ""
        // 값을 설정할 때 로그를 출력한다.
        set(value) {
            println("set: $value")
            field = value
        }
        // 값을 받아올 때 로그를 출력한다.
        get() {
            println("get")
            return field
        }
}

fun main() {
    val user = User()
    user.name = "devkuma"
    println("${user.name}(${user.id})")
}
