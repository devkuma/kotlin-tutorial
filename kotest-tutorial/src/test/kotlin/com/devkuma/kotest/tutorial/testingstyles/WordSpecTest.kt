package com.devkuma.kotest.tutorial.testingstyles

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class WordSpecTest : WordSpec({
    "WordSpec 예제 - 덧셈 테스트" should {
        "2와 2를 더하면 4가 되어야 합니다" {
            val result = 2 + 2
            result shouldBe 4
        }
    }
})