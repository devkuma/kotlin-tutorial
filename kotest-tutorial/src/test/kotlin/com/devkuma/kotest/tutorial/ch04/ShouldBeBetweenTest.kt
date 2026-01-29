package com.devkuma.kotest.tutorial.ch04

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.ints.shouldBeBetween

class ShouldBeBetweenTest : StringSpec({
    "범위 테스트" {
        val age = 25
        age.shouldBeBetween(18, 30)
    }
})