package com.devkuma.kotest.tutorial.assertions.inspectors

import io.kotest.core.spec.style.StringSpec
import io.kotest.inspectors.forAtLeast
import io.kotest.matchers.string.shouldHaveMinLength

class InspectorsTest1 : StringSpec({

    "test1" {
        val xs = listOf("dev", "gareth", "timothy", "muhammad")
        xs.forAtLeast(2) {
            it.shouldHaveMinLength(7)
        }
    }
})