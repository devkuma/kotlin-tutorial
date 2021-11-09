package basic.functions.inline

inline fun f(crossinline body: () -> Unit) {
    Runnable {
        body()
    }.run()
    // ...
}

fun main() {
    f { println("Hello!") }
}
