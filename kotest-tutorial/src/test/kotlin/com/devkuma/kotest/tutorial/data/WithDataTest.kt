package com.devkuma.kotest.tutorial.data

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class WithDataTest : FunSpec({

    context("문자열 길이 검증") {
        withData(
            ValueExpected("Hello", 5), // 첫 번째 데이터 세트: 문자열 "Hello"
            ValueExpected("World", 5)  // 두 번째 데이터 세트: 문자열 "World"
        ) { (str, expected) ->
            str.length shouldBe expected // 각 데이터 세트에 대해 문자열의 길이가 기대값인 확인
        }
    }

    context("집합 크기 검증") {
        withData(
            ValueExpected(setOf(1, 2, 3), 3),   // 첫 번째 데이터 세트: 정수 집합 {1, 2, 3}
            ValueExpected(setOf(4, 5, 6, 7), 4) // 두 번째 데이터 세트: 정수 집합 {4, 5, 6, 7}
        ) { (set, expected) ->
            set.size shouldBe expected // 각 데이터 세트에 대해 집합의 크기가 기대값인 확인
        }
    }

    context("맵 크기 검증") {
        withData(
            ValueExpected(mapOf("a" to 1, "b" to 2), 2),             // 첫 번째 데이터 세트: 맵 {"a" -> 1, "b" -> 2}
            ValueExpected(mapOf("x" to 10, "y" to 20, "z" to 30), 3) // 두 번째 데이터 세트: 맵 {"x" -> 10, "y" -> 20, "z" -> 30}
        ) { (map, expected) ->
            map.size shouldBe expected // 각 데이터 세트에 대해 맵의 크기가 기대값인 확인
        }
    }
})

data class ValueExpected<T>(
    val value: T,
    val expected: Int,
)