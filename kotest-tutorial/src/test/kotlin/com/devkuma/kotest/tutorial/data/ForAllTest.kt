package com.devkuma.kotest.tutorial.data

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class ForAllTest : StringSpec({

    "문자열 길이 검증" {
        forAll(
            row("Hello", 5),
            row("World", 5)
        ) { str, expected ->
            str.length shouldBe expected
        }
    }

    "집합 크기 검증" {
        forAll(
            row(setOf(1, 2, 3), 3),
            row(setOf(4, 5, 6, 7), 4)
        ) { set, expected ->
            set.size shouldBe expected
        }
    }

    "맵 크기 검증" {
        forAll(
            row(mapOf("a" to 1, "b" to 2), 2),
            row(mapOf("x" to 10, "y" to 20, "z" to 30), 3)
        ) { map, expected ->
            map.size shouldBe expected
        }
    }
})