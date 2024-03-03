package com.devkuma.kotest.tutorial.mocking

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk

interface Service {
    fun getValue(): Int
}

class StubbingTest : StringSpec({

    "Stubbing을 사용하여 getValue() 호출에 대한 반환 값 설정하기" {
        // Mock 객체 생성
        val mockService = mockk<Service>()

        // Stubbing: getValue() 메서드 호출에 대해 10을 반환하도록 설정
        every { mockService.getValue() } returns 10

        // Stubbed 메서드 호출 및 결과 검증
        val result = mockService.getValue()
        result shouldBe 10
    }
})