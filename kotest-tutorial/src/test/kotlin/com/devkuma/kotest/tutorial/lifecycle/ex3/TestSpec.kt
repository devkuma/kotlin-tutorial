package com.devkuma.kotest.tutorial.lifecycle.ex3

import io.kotest.core.spec.style.WordSpec
import io.kotest.core.test.TestCase
class TestSpec : WordSpec() {

    override suspend fun beforeTest(testCase: TestCase) {
        println("Starting a test $testCase")
    }

    init {
        "this test" should {
            "be alive" {
                println("devkuma is alive!")
            }
        }
    }
}