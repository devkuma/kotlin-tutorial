package com.devkuma.kotest.tutorial.lifecycle.ex2

import io.kotest.core.spec.style.WordSpec
import io.kotest.core.test.TestCase

val startTest: suspend (TestCase) -> Unit = {
    println("Starting a test $it")
}

class TestSpec : WordSpec({

    // used once
    beforeTest(startTest)

    "this test" should {
        "be alive" {
            println("devkuma is alive!")
        }
    }
})

class OtherSpec : WordSpec({

    // used twice
    beforeTest(startTest)

    "this test" should {
        "fail" {
            println("boom")
        }
    }
})