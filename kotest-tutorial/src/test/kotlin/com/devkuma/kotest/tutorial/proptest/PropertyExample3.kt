package com.devkuma.kotest.tutorial.proptest

import io.kotest.core.spec.style.StringSpec
import io.kotest.property.checkAll

class PropertyExample3: StringSpec({
    "a many iterations test" {
        checkAll<Double, Double>(10_000) { a, b ->
            // test here
            println("a=$a, b=$b")
        }
    }
})