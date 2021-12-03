package basic.classes

class User1 constructor(id: Long, name: String) {
    var name = name
}

fun main() {
    var user1 = User1(1,"devkuma")
    println(user1.name)
}