package com.devkuma.kotest.tutorial.ch04

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.string.shouldContain
import io.kotest.matchers.string.shouldStartWith

class ShouldStringTest : StringSpec({
    "문자열 테스트" {
        val name = "Kotest is awesome"

        name shouldContain "awesome"
        name shouldStartWith "Kotest"
    }
})