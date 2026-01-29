package com.devkuma.kotest.tutorial.ch04

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

data class Person(val name: String, val age: Int)

class PersonTest : StringSpec({
    "두 데이터 객체는 같아야 한다" {
        val person1 = Person("devkuma", 30)
        val person2 = Person("devkuma", 30)
        person1 shouldBe person2  // 데이터 클래스 간의 동등성 비교
    }
})