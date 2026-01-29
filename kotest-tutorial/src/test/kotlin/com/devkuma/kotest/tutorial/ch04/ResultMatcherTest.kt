package com.devkuma.kotest.tutorial.ch04

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec

class ResultMatcherTest : StringSpec({
    "특정 예외가 발생해야 한다" {
        shouldThrow<IllegalArgumentException> {
            throw IllegalArgumentException("잘못된 인자입니다.")
        }
    }
})