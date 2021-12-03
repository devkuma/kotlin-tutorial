package basic.classes

class User2(name: String) {
    var name = name
}

fun main() {
    var user2 = User2("devkuma")
    println(user2.name)
}