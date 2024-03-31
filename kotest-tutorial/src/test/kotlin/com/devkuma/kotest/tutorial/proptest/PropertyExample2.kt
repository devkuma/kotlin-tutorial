package com.devkuma.kotest.tutorial.proptest

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.string.shouldHaveLength
import io.kotest.property.checkAll

class PropertyExample2: StringSpec({
    "String size" {
        checkAll<String, String> { a, b ->
            a + b shouldHaveLength a.length + b.length
            println("a=$a, b=$b")
        }
    }
})