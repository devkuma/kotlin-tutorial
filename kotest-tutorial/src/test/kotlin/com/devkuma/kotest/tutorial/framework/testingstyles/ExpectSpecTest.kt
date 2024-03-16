package com.devkuma.kotest.tutorial.framework.testingstyles

import io.kotest.core.spec.style.ExpectSpec
import io.kotest.matchers.shouldBe

class ExpectSpecTest : ExpectSpec({
    context("ExpectSpec 예제") {
        expect("덧셈 테스트") {
            val result = 2 + 2
            2 + 2 shouldBe 4
        }
    }
})