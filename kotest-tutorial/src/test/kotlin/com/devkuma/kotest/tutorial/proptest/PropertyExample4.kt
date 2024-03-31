package com.devkuma.kotest.tutorial.proptest

import io.kotest.core.spec.style.StringSpec
import io.kotest.property.Arb
import io.kotest.property.arbitrary.int
import io.kotest.property.forAll

class PropertyExample4 : StringSpec({

    fun isDrinkingAge(a: Int): Boolean =
        a in 19..Int.MAX_VALUE

    "is allowed to drink in Chicago" {
        forAll(Arb.int(21..150)) { a ->
            isDrinkingAge(a) // assuming some function that calculates if we're old enough to drink
        }
    }
    "is allowed to drink in London" {
        forAll(Arb.int(18..150)) { a ->
            isDrinkingAge(a) // assuming some function that calculates if we're old enough to drink
        }
    }
})