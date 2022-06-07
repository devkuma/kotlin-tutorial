package basic.coroutine

import kotlinx.coroutines.*

fun main() = runBlocking {  // this: coroutineScope
    launch { doWorld() }
    println("Hello")
}

suspend fun doWorld() {
    delay(1000L)
    println("World!")
}