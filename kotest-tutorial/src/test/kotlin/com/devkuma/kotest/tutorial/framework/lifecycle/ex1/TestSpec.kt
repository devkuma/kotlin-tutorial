package com.devkuma.kotest.tutorial.framework.lifecycle.ex1

import io.kotest.core.spec.style.WordSpec

class TestSpec : WordSpec({
    beforeTest {
        println("Starting a test $it")
    }

    afterTest { (test, result) ->
        println("Finished spec with result $result")
    }

    "this test" should {
        "be alive" {
            println("devkuma is alive!")
        }
    }
})