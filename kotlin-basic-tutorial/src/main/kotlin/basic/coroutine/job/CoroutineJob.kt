package basic.coroutine.job

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch { // 새로 coroutine을 시작하고, job에 대한 참조를 유지한다.
        delay(1000L)
        println("World!")
    }
    println("Hello")
    job.join() // 하위 coroutine이 완료될 때까지 기다린다.
    println("Done")
}