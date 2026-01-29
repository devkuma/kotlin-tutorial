package com.devkuma.kotest.tutorial.ch05

import io.kotest.core.spec.style.StringSpec

class BeforeAfterSpecTest : StringSpec({
    beforeSpec {
        // Spec 실행 전에 실행될 코드
        println("Before Spec")
    }

    afterSpec {
        // Spec 실행 후에 실행될 코드
        println("After Spec")
    }

    "test case 1" {
        // 테스트 코드
        println("Test Case 1")
    }

    "test case 2" {
        // 테스트 코드
        println("Test Case 2")
    }
})