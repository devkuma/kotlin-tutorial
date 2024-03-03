package com.devkuma.kotest.tutorial.property

import io.kotest.core.spec.style.StringSpec
import io.kotest.property.forAll

class PropertyBasedTestingTest : StringSpec({
    "프로퍼티 기반 테스트 예시" {
        forAll<Int, Int> { a, b ->
            a + b == b + a
        }
    }
})