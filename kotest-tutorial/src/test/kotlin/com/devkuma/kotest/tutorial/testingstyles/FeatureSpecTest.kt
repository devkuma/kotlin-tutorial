package com.devkuma.kotest.tutorial.testingstyles

import io.kotest.core.spec.style.FeatureSpec
import io.kotest.matchers.shouldBe

class FeatureSpecTest : FeatureSpec({
    feature("FeatureSpec 예제") {
        scenario("덧셈 테스트") {
            val result = 2 + 2
            result shouldBe 4
        }
    }
})