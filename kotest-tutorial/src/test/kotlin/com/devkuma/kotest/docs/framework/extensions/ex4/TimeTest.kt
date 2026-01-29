package com.devkuma.kotest.docs.framework.extensions.ex4

import io.kotest.core.spec.style.FunSpec

class TimeTest : FunSpec({
    extensions(TimerListener)

    // tests here
    test("TimeTest") {
        println("TimeTest")
    }
})