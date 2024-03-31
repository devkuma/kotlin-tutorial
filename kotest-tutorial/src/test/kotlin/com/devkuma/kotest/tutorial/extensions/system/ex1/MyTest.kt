package com.devkuma.kotest.tutorial.extensions.system.ex1

import io.kotest.core.spec.style.FreeSpec
import io.kotest.extensions.system.SystemEnvironmentTestListener
import io.kotest.matchers.shouldBe

class MyTest : FreeSpec() {

    override fun listeners() = listOf(SystemEnvironmentTestListener("foo", "bar"))

    init {
        "MyTest" {
            System.getenv("foo") shouldBe "bar"
        }
    }
}
