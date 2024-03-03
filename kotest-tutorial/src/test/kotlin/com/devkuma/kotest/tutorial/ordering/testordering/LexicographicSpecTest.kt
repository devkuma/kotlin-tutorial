package com.devkuma.kotest.tutorial.ordering.testordering

import io.kotest.core.spec.style.StringSpec
import io.kotest.core.test.TestCaseOrder

class LexicographicSpecTest : StringSpec() {

    override fun testCaseOrder(): TestCaseOrder = TestCaseOrder.Lexicographic

    init {

        "beta" {
            // I run second as gamma < beta < alpha
            println("beta")
        }

        "alpha" {
            // I run first as gamma < beta < alpha
            println("alpha")
        }

        "gamma" {
            // I run third as gamma < beta < alpha
            println("gamma")
        }
    }
}