package com.devkuma.kotest.tutorial.framework.testingstyles

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class StringSpecTest : StringSpec({
    "StringSpec 예제 - 덧셈 테스트" {
        val result = 2 + 2
        result shouldBe 4
    }
})