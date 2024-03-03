package com.devkuma.kotest.tutorial.datadriven

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class PythagTripleNameTest : FunSpec({

    context("Pythag triples tests") {
        withData<PythagTriple>(
            nameFn = { "${it.a}, ${it.b}, ${it.c}" },
            PythagTriple(3, 4, 5),
            PythagTriple(6, 8, 10),
            PythagTriple(8, 15, 17),
            PythagTriple(7, 24, 25)
        ) { (a, b, c) ->
            a * a + b * b shouldBe c * c
        }
    }
})