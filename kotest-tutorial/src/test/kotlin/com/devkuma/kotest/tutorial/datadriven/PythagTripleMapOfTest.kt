package com.devkuma.kotest.tutorial.datadriven

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class PythagTripleMapOfTest : FunSpec({

    context("Pythag triples tests") {
        withData(
            mapOf(
                "3, 4, 5" to PythagTriple(3, 4, 5),
                "6, 8, 10" to PythagTriple(6, 8, 10),
                "8, 15, 17" to PythagTriple(8, 15, 17),
                "7, 24, 25" to PythagTriple(7, 24, 25)
            )
        ) { (a, b, c) ->
            a * a + b * b shouldBe c * c
        }
    }
})