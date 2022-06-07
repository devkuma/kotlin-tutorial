package basic.coroutine.scope

import kotlinx.coroutines.*

fun main() = runBlocking {
    doWorld()
}

suspend fun doWorld() = coroutineScope {  // this: coroutineScope
    launch {
        delay(1000L)
        println("World!")
    }
    println("Hello")
}