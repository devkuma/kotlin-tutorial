package com.devkuma.kotest.tutorial.testingstyles

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class FunSpecTest : FunSpec({
    test("FunSpec 예제 - 덧셈 테스트") {
        val result = 2 + 2
        result shouldBe 4
    }
})