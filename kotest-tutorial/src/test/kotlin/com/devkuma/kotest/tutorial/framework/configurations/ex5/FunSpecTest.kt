package com.devkuma.kotest.tutorial.framework.configurations.ex5

import io.kotest.core.spec.style.FunSpec
import io.kotest.core.test.config.TestCaseConfig

class FunSpecTest : FunSpec() {
    init {

        defaultTestConfig = TestCaseConfig(enabled = true, invocations = 3)

        test("FunSpec should support Spec config syntax in init{} block") {
            // ...
        }
    }
}