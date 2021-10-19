package basic.threads

fun main() {
    var thread = Thread {
        println("Hello! This is lambda thread ${Thread.currentThread()}")
    }

    thread.start()
}

