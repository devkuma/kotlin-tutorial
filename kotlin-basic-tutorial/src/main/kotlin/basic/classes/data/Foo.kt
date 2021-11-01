package basic.classes.data

class Foo1(var name: String)        // 일반 클래스
data class Foo2(var name: String)   // 데이터 클래스

fun main() {
    var a1 = Foo1("devkuma")
    println(a1)              // Foo1@2280cdac

    var a2 = Foo2("devkuma")
    println(a2)              // Foo2(name=devkuma)

    var a3 = a2.copy()
    println(a3)              // Foo2(name=devkuma)
}