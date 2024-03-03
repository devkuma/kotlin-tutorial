package com.devkuma.kotest.tutorial

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MyTest : StringSpec({
    "My first test" {
        val result = 1 + 1
        result shouldBe 2
    }
})