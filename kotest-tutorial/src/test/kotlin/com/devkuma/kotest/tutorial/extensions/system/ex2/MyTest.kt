package com.devkuma.kotest.tutorial.extensions.system.ex2

import io.kotest.core.spec.style.FreeSpec
import io.kotest.extensions.system.SystemPropertyTestListener
import io.kotest.matchers.shouldBe

class MyTest : FreeSpec() {

    override fun listeners() = listOf(SystemPropertyTestListener("foo", "bar"))

    init {
        "MyTest" {
            System.getProperty("foo") shouldBe "bar"
        }
    }
}