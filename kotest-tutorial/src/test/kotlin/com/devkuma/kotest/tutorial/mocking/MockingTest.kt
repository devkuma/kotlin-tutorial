package com.devkuma.kotest.tutorial.mocking

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk

interface DataService {
    fun retrieveData(): String
}

class MockingTest : StringSpec({

    "MockK를 사용한 모킹" {
        val mock = mockk<DataService> {
            every { retrieveData() } returns "Mocked data"
        }
        val result = mock.retrieveData()
        result shouldBe "Mocked data"
    }
})