package com.devkuma.kotest.tutorial.assertions

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.collections.shouldContainAll
import io.kotest.matchers.collections.shouldContainExactly
import io.kotest.matchers.collections.shouldNotContain
import io.kotest.matchers.ints.shouldBeGreaterThan
import io.kotest.matchers.ints.shouldBeInRange
import io.kotest.matchers.ints.shouldBeLessThan
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import io.kotest.matchers.string.shouldBeBlank
import io.kotest.matchers.string.shouldBeEqualIgnoringCase

class MatchersTest : FreeSpec({

    "Matchers" - {
        val number = 10
        "값이 기대한 값과 동일한지 확인한다." {
            number shouldBe 10
        }

        "값이 기대한 값과 다른지 확인한다." {
            number shouldNotBe 20
        }

        val blankString = ""
        "문자열이 공백으로만 구성되어 있는지 확인한다." {
            blankString.shouldBeBlank()
        }

        val numbers = listOf(1, 2, 3, 4, 5)

        "컬렉션이 지정된 요소를 포함하는지 확인한다." {
            numbers shouldContain 3
        }

        "컬렉션이 지정된 요소를 포함하지 않는지 확인한다." {
            numbers shouldNotContain 6
        }

        "컬렉션이 지정된 모든 요소를 포함하는지 확인한다." {
            numbers shouldContainAll listOf(2, 4)
        }

        "컬렉션이 지정된 요소들로 완전히 일치하는지 확인한다." {
            numbers.shouldContainExactly(1, 2, 3, 4, 5)
        }

        val value = 10
        "값이 지정된 범위에 속하는지 확인한다." {
            value shouldBeInRange 5..15
        }

        "값이 지정된 값보다 큰지 확인한다." {
            value shouldBeGreaterThan 5
        }

        "값이 지정된 값보다 작은지 확인한다." {
            value shouldBeLessThan 15
        }

        val message = "Hello, Kotest"
        "대소문자 무시하고 일치하는지" {
            message shouldBeEqualIgnoringCase "HELLO, KOTEST"
        }
    }
})