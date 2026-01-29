package com.devkuma.kotest.tutorial.ch05

import io.kotest.core.spec.style.StringSpec

class BeforeAfterTest : StringSpec({
    beforeTest {
        // 각 테스트 케이스 실행 전에 실행될 코드
        println("Before Test: ${it.name.testName}")
    }

    afterTest {
        // 각 테스트 케이스 실행 후에 실행될 코드
        println("After Test: ${it.a.name.testName}")
    }

    "test case 1" {
        println("Executing Test Case 1")
    }

    "test case 2" {
        println("Executing Test Case 2")
    }
})