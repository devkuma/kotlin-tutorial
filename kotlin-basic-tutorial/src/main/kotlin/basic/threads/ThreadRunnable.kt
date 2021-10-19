package basic.threads

class ThreadRunnable : Runnable {
    override fun run() {
        println("Hello! This is runnable ${hashCode()}")
    }
}

fun main() {
    val thread = Thread(ThreadRunnable())

    thread.start()
}