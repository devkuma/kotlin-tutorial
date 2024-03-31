package com.devkuma.kotest.tutorial.framework.configurations.ex2

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe
import kotlin.time.Duration.Companion.seconds

class MyTests : WordSpec() {
    init {
        "String.length" should {
            "return the length of the string".config(timeout = 2.seconds) {
                "sammy".length shouldBe 5
                "".length shouldBe 0
            }
        }
    }
}