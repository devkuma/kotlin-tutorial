package com.devkuma.kotest.tutorial.ch04

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ShouldBeTest : StringSpec({
    "값이 동일한지 확인하는 예제" {
        val result = 42
        result shouldBe 42
    }
})