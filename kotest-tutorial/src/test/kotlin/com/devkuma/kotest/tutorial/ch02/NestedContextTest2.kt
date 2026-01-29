package com.devkuma.kotest.tutorial.ch02

import io.kotest.core.spec.style.FunSpec

class NestedContextTest2 : FunSpec({

    context("Calculator tests") {
        test("Addition") {
            // Test logic for addition
        }

        test("Subtraction") {
            // Test logic for subtraction
        }
    }

    context("String tests") {
        test("Length") {
            // Test logic for string length
        }

        test("Concatenation") {
            // Test logic for string concatenation
        }
    }
})