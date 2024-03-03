package com.devkuma.kotest.tutorial.resources

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.StringReader

class StringTest : StringSpec({

    val reader = autoClose(StringReader("xyz"))

    "test" {
        val text = reader.readText()

        println(text)

        text shouldBe "xyz"
    }
})