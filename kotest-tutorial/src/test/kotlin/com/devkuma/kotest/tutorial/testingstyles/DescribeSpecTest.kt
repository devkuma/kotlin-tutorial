package com.devkuma.kotest.tutorial.testingstyles

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class DescribeSpecTest : DescribeSpec({
    describe("DescribeSpec 예제") {
        it("덧셈 테스트") {
            val result = 2 + 2
            result shouldBe 4
        }
    }
})