package com.devkuma.kotest.tutorial.ch04

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldNotBe

class ShouldNotBeTest : StringSpec({
    "값이 다른지 확인하는 예제" {
        val result = 42
        result shouldNotBe 100
    }
})