package com.devkuma.kotest.tutorial.proptest

import io.kotest.core.spec.style.StringSpec
import io.kotest.property.forAll

class PropertyExample1: StringSpec({
    "String size" {
        forAll<String, String> { a, b ->
            println("a=$a, b=$b")
            (a + b).length == a.length + b.length
        }
    }
})