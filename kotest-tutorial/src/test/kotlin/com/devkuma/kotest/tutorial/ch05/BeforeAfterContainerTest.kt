package com.devkuma.kotest.tutorial.ch05

import io.kotest.core.spec.style.FunSpec

class BeforeAfterContainerTest : FunSpec({
    beforeContainer {
        println("Before container: ${it.name.testName}")
    }

    afterContainer {
        println("After container: ${it.a.name.testName}")
    }

    context("group of tests") {
        test("test case 1") {
            println("Executing Test Case 1")
        }

        test("test case 2") {
            println("Executing Test Case 2")
        }
    }
})