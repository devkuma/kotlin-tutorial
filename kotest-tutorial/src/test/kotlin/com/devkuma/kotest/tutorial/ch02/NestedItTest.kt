package com.devkuma.kotest.tutorial.ch02

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class NestedItTest : DescribeSpec({
    describe("Calculator") {
        context("when adding two positive numbers") {
            it("should return the correct sum") {
                val calculator = Calculator()
                val result = calculator.add(2, 3)
                result shouldBe 5
            }
        }
    }
})

class Calculator {
    fun add(a: Int, b: Int) = a + b
}