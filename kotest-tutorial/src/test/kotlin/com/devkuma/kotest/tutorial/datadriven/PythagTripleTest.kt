package com.devkuma.kotest.tutorial.datadriven

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.WithDataTestName
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class PythagTripleTest : FunSpec({
    context("Pythag triples tests") {
        withData(
            PythagTriple(3, 4, 5),
            PythagTriple(6, 8, 10),
            //PythagTriple(5, 4, 3),
            PythagTriple(8, 15, 17),
            PythagTriple(7, 24, 25)
        ) { (a, b, c) ->
            isPythagTriple(a, b, c) shouldBe true
        }
    }

//    withData(
//        PythagTriple(3, 4, 5),
//        PythagTriple(6, 8, 10),
//        //PythagTriple(5, 4, 3),
//        PythagTriple(8, 15, 17),
//        PythagTriple(7, 24, 25)
//    ) { (a, b, c) ->
//        isPythagTriple(a, b, c) shouldBe true
//    }
})

fun isPythagTriple(a: Int, b: Int, c: Int): Boolean = a * a + b * b == c * c

//data class PythagTriple(val a: Int, val b: Int, val c: Int)

data class PythagTriple(val a: Int, val b: Int, val c: Int) : WithDataTestName {
    override fun dataTestName() = "wibble $a, $b, $c wobble"
}
