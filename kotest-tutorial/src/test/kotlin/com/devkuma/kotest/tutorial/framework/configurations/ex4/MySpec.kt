package com.devkuma.kotest.tutorial.framework.configurations.ex4

import io.kotest.core.spec.style.StringSpec
import io.kotest.core.test.config.TestCaseConfig

class MySpec : StringSpec() {

    override fun defaultTestCaseConfig() = TestCaseConfig(invocations = 3)

    init {
        // your test cases ...
    }
}