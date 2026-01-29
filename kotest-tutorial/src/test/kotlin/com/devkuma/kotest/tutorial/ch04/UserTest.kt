package com.devkuma.kotest.tutorial.ch04

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.ints.shouldBeGreaterThanOrEqual


data class User(val name: String, val age: Int)

fun User.shouldBeAdult() {
    this.age shouldBeGreaterThanOrEqual 18
}

class UserTest : StringSpec({
    "사용자가 성인이지 확인한다." {
        val user = User("devkuma", 20)
        user.shouldBeAdult()
    }
})