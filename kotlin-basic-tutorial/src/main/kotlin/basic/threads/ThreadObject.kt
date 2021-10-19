package basic.threads

fun main() {
    val thread = object : Thread() {
        override fun run() {
            println("Hello! This is object Thread ${currentThread()}")
        }
    }

    thread.start()
}