package com.devkuma.kotest.tutorial.assertions.custommatchers

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.*
import io.kotest.matchers.should

fun containEvenNumbers() = Matcher<List<Int>> { value ->
    MatcherResult(
        value.any { it % 2 == 0 },
        { "List should contain even numbers" },
        { "List should not contain even numbers" }
    )
}

fun List<Int>.shouldContainEvenNumbers(): List<Int> {
    this should containEvenNumbers()
    return this
}

infix fun <T> T.should(matcher: (T) -> Unit) = matcher(this)

class ContainEvenNumbersCustomMatcher : FunSpec({
    test("should") {
        val list = listOf(1, 2, 3, 4, 5)
        list should containEvenNumbers()
    }

    test("shouldContainEvenNumbers") {
        val list = listOf(1, 2, 3, 4, 5)
        list.shouldContainEvenNumbers()
    }
})