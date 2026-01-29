package com.devkuma.kotest.tutorial.ch02

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class NestedShouldTest : ShouldSpec({
    context("when adding two positive numbers") {
        should("return the correct sum") {
            val calculator = Calculator()
            val result = calculator.add(2, 3)
            result shouldBe 5
        }
    }
})