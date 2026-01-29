package com.devkuma.kotest.tutorial.ch04

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.Matcher
import io.kotest.matchers.MatcherResult
import io.kotest.matchers.should

fun isEven(): Matcher<Int> = object : Matcher<Int> {
    override fun test(value: Int): MatcherResult {
        val passed = value % 2 == 0
        return MatcherResult(
            passed,
            { "$value 은(는) 짝수가 아니다." },
            { "$value 은(는) 짝수이다." }
        )
    }
}

class CustomMatcherTest : StringSpec({
    "4는 짝수여야 한다" {
        4 should isEven()
    }
})