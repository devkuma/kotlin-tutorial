package com.devkuma.kotest.tutorial.framework.ordering.testordering

import io.kotest.core.spec.style.StringSpec
import io.kotest.core.test.TestCaseOrder

class RandomSpecTest : StringSpec() {

    override fun testCaseOrder(): TestCaseOrder = TestCaseOrder.Random

    init {
        "foo" {
            // This test may run first or second
            println("foo")
        }

        "bar" {
            // This test may run first or second
            println("bar")
        }
    }
}