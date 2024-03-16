package com.devkuma.kotest.tutorial.framework.testingstyles

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class BehaviorSpecTest : BehaviorSpec({
    Given("BehaviorSpec 예제") {
        When("덧셈 테스트") {
            val result = 2 + 2
            Then("2와 2를 더하면 4가 되어야 합니다") {
                result shouldBe 4
            }
        }
    }
})