package com.devkuma.kotest.tutorial.framework.configurations.ex1

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class MyTests : ShouldSpec() {
    init {
        should("return the length of the string").config(invocations = 10, threads = 2) {
            "sammy".length shouldBe 5
            "".length shouldBe 0
        }
    }
}