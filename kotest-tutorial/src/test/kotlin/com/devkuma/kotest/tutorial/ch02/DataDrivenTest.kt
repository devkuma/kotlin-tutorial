package com.devkuma.kotest.tutorial.ch02

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.Row3
import io.kotest.data.forAll
import io.kotest.matchers.shouldBe

class DataDrivenTest : StringSpec({
    "maximum of two numbers" {
        forAll(
            Row3(1, 5, 5),
            Row3(1, 0, 1),
            Row3(0, 0, 0)
        ) { a, b, max ->
            a.coerceAtLeast(b) shouldBe max
        }
    }
})