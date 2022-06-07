package basic.coroutine.scope

import kotlinx.coroutines.*

fun main() = runBlocking { // serial
    countToDown()
    println("fire!")
}

suspend fun countToDown() = coroutineScope { // concurrent
    launch {
        delay(2000L)
        println("1")
    }
    launch {
        delay(1000L)
        println("2")
    }
    println("3")
}