package basic.coroutine

import kotlinx.coroutines.*

fun main(): Unit = runBlocking {
    launch {
        delay(3000L) // 3초간 처리를 중단. 스레드가 해제되기 때문에 먼저 Hello가 표시된다.
        println("Coroutine")
    }
    println("Hello")
}