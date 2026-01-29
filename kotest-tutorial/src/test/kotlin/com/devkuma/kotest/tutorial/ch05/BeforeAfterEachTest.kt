package com.devkuma.kotest.tutorial.ch05

import io.kotest.core.spec.style.StringSpec

class BeforeAfterEachTest : StringSpec({
    beforeEach {
        println("Before each test")
    }

    afterEach {
        println("After each test")
    }

    "test case 1" {
        println("Test Case 1")
    }

    "test case 2" {
        println("Test Case 2")
    }
})