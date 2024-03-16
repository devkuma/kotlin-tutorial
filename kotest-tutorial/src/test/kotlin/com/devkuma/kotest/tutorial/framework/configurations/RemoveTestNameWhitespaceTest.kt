package com.devkuma.kotest.tutorial.framework.configurations

import io.kotest.core.config.AbstractProjectConfig
import io.kotest.core.spec.style.StringSpec

class RemoveTestNameWhitespaceTest : StringSpec({

    beforeTest {
        println(it.name.testName)
    }

    """this is
       my test case""" {
        // test here
    }
})

object KotestProjectConfig : AbstractProjectConfig() {
    override val testNameRemoveWhitespace = true
}