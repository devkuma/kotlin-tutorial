package com.devkuma.kotest.tutorial.datadriven

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData

class CallbackTest : FunSpec({

    beforeTest {
        println("beforeTest")
    }

    context("callback test") {
        withData("X", "Y", "Z") { a ->
            println(a)
        }
    }
})