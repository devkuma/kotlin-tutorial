package com.devkuma.kotest.tutorial.ch07

import io.kotest.core.spec.style.StringSpec
import io.mockk.every
import io.mockk.mockk


class UserNameService {
    fun getUserName(id: Int): String {
        return "실제 사용자"
    }
}

class StubbingParameterTest : StringSpec({

    "Stubbing을 통한 반환값 설정" {
        val mockUserService = mockk<UserNameService>()

        // 특정 ID에 대해 가짜 값을 반환하도록 Stubbing
        every { mockUserService.getUserName(1) } returns "가짜 사용자 1"
        every { mockUserService.getUserName(2) } returns "가짜 사용자 2"

        // Stubbing된 값을 확인
        println(mockUserService.getUserName(1))  // "가짜 사용자 1" 출력
        println(mockUserService.getUserName(2))  // "가짜 사용자 2" 출력
    }
})