package com.devkuma.kotest.tutorial.assertions.inspectors

import io.kotest.core.spec.style.StringSpec
import io.kotest.inspectors.forAtLeast
import io.kotest.inspectors.forNone
import io.kotest.matchers.string.shouldContain
import io.kotest.matchers.string.shouldHaveMinLength
import io.kotest.matchers.string.shouldStartWith

class InspectorsTest2 : StringSpec({

    "test2" {
        val xs = listOf("dev", "gareth", "timothy", "muhammad")
        xs.forNone {
            it.shouldContain("x")
            it.shouldStartWith("bb")
        }
    }
})