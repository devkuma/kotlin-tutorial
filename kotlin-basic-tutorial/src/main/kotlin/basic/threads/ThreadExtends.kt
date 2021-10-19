package basic.threads

class ThreadExtends : Thread(){
    override fun run() {
        println("Hello! This is extends ${currentThread()}")
    }
}

fun main() {
    val thread = ThreadExtends()
    thread.start()
}