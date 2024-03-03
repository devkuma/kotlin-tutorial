package com.devkuma.kotest.tutorial.testingstyles

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class ShouldSpecTest : ShouldSpec({
    should("ShouldSpec 예제 - 덧셈 테스트") {
        val result = 2 + 2
        result shouldBe 4
    }
})