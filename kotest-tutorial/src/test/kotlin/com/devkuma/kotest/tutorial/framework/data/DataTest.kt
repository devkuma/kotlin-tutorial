package com.devkuma.kotest.tutorial.framework.data

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class DataTest : StringSpec({

    val testData = listOf(1, 2, 3, 4, 5)

    "사전 정의된 테스트 데이터를 사용하여 테스트" {
        testData.size shouldBe 5
    }

    "범위 내에서 테스트 데이터를 사용하여 테스트" {
        val generatedData = (1..10).toList()
        generatedData.size shouldBe 10
    }
})