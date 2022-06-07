package basic.coroutine.light

import kotlinx.coroutines.*

fun main() {
    launchCoroutines() // success!
    runThreads() // java.lang.OutOfMemoryError
}

private fun launchCoroutines() = runBlocking {
    repeat(100_000) { // launch a lot of coroutines
        launch {
            delay(5000L)
            print(".")
        }
    }
}

private fun runThreads() {
    repeat(100_000) { // launch a lot of threads
        object : Thread() {
            override fun run() {
                sleep(5000L)
                print(".")
            }
        }.start()
    }
}