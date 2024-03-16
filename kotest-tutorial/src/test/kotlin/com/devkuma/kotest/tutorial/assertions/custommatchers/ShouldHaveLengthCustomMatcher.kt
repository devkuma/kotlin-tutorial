package com.devkuma.kotest.tutorial.assertions.custommatchers

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.Matcher
import io.kotest.matchers.MatcherResult
import io.kotest.matchers.should
import io.kotest.matchers.shouldNot

fun haveLength(length: Int) = Matcher<String> { value ->
    MatcherResult(
        value.length == length,
        { "string had length ${value.length} but we expected length $length" },
        { "string should not have length $length" },
    )
}

fun String.shouldHaveLength(length: Int): String {
    this should haveLength(length)
    return this
}

fun String.shouldNotHaveLength(length: Int): String {
    this shouldNot haveLength(length)
    return this
}

class CustomMatcherTest : FunSpec({
    test("should") {
        "hello foo" should haveLength(9)
        "hello bar" shouldNot haveLength(3)
    }

    test("shouldHaveLength") {
        "hello foo".shouldHaveLength(9)
        "hello bar".shouldNotHaveLength(3)
    }
})
