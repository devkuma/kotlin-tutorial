package com.devkuma.kotest.tutorial.coroutines.ex2

import io.kotest.core.spec.style.FunSpec
import io.kotest.core.test.testCoroutineScheduler
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.TestCoroutineScheduler
import kotlin.time.Duration.Companion.days

class TestDispatcherTest : FunSpec() {
    init {
        test("advance time").config(coroutineTestScope = true) {
            val duration = 1.days
            // launch a coroutine that would normally sleep for 1 day
            launch {
                delay(duration.inWholeMilliseconds)
            }
            val testCoroutineScheduler = TestCoroutineScheduler()
            // move the clock on and the delay in the above coroutine will finish immediately.
            testCoroutineScheduler.advanceTimeBy(duration.inWholeMilliseconds)
            val currentTime = testCoroutineScheduler.currentTime
        }
    }
}