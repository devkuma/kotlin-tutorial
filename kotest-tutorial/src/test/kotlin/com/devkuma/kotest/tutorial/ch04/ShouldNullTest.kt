package com.devkuma.kotest.tutorial.ch04

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.nulls.shouldBeNull

class ShouldNullTest : StringSpec({

    "Null 인지 테스트" {
        val value: String? = null
        value.shouldBeNull()
    }
})