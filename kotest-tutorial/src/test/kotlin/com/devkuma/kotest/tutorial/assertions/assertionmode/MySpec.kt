package com.devkuma.kotest.tutorial.assertions.assertionmode

import io.kotest.core.spec.style.FunSpec
import io.kotest.core.test.AssertionMode

class MySpec : FunSpec() {
    init {
        assertions = AssertionMode.Error
        test("this test has no assertions") {
            val name = "sam"
            name.length == 3 // this isn't actually testing anything
        }
    }
}