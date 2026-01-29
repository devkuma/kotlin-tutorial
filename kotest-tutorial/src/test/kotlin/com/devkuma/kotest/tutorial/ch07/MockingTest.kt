package com.devkuma.kotest.tutorial.ch07

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk

class Service {
    fun getData(): String {
        return "실제 데이터"
    }
}

class MockingTest : StringSpec({

    "MockK를 이용한 Mocking" {
        val mockService = mockk<Service>()

        every { mockService.getData() } returns "가짜 데이터"

        // 가짜 객체가 리턴하는 값을 확인
        mockService.getData() shouldBe "가짜 데이터"
    }
})