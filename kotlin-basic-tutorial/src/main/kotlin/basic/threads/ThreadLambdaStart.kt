package basic.threads

fun startThread(): Thread {
    val thread = Thread {
        println("Hello! This is start lambda thread ${Thread.currentThread()}")
    }
    thread.start()
    return thread;
}

fun main() {
    startThread()
}