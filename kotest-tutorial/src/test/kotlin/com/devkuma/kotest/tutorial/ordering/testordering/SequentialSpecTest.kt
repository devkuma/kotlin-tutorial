package com.devkuma.kotest.tutorial.ordering.testordering

import io.kotest.core.spec.style.StringSpec
import io.kotest.core.test.TestCaseOrder

class SequentialSpecTest : StringSpec() {

    override fun testCaseOrder(): TestCaseOrder = TestCaseOrder.Sequential

    init {
        "foo" {
            // I run first as I'm defined first
            println("foo")
        }

        "bar" {
            // I run second as I'm defined second
            println("bar")
        }
    }
}