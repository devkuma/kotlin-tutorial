package basic.etc

class ByLazy {
    val greeting: String by lazy {
        println("Greeting is Initialized!!!!") // 한번만 실행된다.
        "Hello"
    }
}

fun main() {
    val byLazy = ByLazy()
    println("Greeting is Not Initialized")
    println("Greeting one : ${byLazy.greeting}")
    println("Greeting two : ${byLazy.greeting}")
    println("Greeting three : ${byLazy.greeting}")
}