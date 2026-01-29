package com.devkuma.kotest.tutorial.ch07

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify


class User(
    val id: Long,
    val name: String,
)

interface UserRepository {
    fun findById(id: Long): User?
}

class UserNotFoundException : Exception("User not found")

class UserService(val repository: UserRepository) {
    fun getUser(id: Long): User {
        return repository.findById(id) ?: throw UserNotFoundException()
    }
}

class StubbingTest : StringSpec({
    "should call repository findById method once" {
        // Mock 객체 생성
        val repository = mockk<UserRepository>()
        val userService = UserService(repository)

        // Stubbing: findById 함수가 호출되면 User 객체 반환
        every { repository.findById(1L) } returns User(1L, "devkuma")

        // 실제 테스트 실행
        val user = userService.getUser(1L)

        // getUser 함수가 호출되었을 때 Stubbed 응답 확인
        user.name shouldBe "devkuma"

        // Mock 객체의 함수 호출 여부 검증
        verify(exactly = 1) { repository.findById(1L) }
    }
})