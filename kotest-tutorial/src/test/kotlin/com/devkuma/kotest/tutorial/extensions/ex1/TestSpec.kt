package com.devkuma.kotest.tutorial.extensions.ex1

import io.kotest.core.spec.style.WordSpec

class TestSpec : WordSpec({
    extension(MyTestListener())

    "testSpec" should {
        println("testSpec")
    }
})