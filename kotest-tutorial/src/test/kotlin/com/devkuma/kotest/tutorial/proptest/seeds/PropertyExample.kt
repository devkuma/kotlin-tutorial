package com.devkuma.kotest.tutorial.proptest.seeds

import io.kotest.core.spec.style.StringSpec
import io.kotest.property.PropTestConfig
import io.kotest.property.forAll

class PropertyExample : StringSpec({
    "String size" {
        forAll<String, String>(PropTestConfig(seed = 127305235)) { a, b ->
            (a + b).length == a.length + b.length
        }
    }
})