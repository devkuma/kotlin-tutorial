package com.devkuma.kotest.tutorial.extensions.ex4

import io.kotest.core.spec.style.FunSpec

class TimeTest : FunSpec({
    extensions(TimerListener)

    // tests here
    test("TimeTest") {
        println("TimeTest")
    }
})