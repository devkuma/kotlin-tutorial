package com.devkuma.kotest.tutorial.ch02

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class MyTest : FunSpec({

    test("my test") {
        1 + 2 shouldBe 3
    }

})