package com.devkuma.kotest.tutorial.assertions.softassertion

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.assertions.assertSoftly

class SoftAssertionTest : StringSpec({

    "assertSoftly를 사용한 테스트" {
        val person = Person(
            "devkuma",
            30
        )

        assertSoftly {
            person.name shouldBe "devkuma"
            person.age shouldBe 30
        }

        assertSoftly(person) {
            name shouldBe "devkuma"
            age shouldBe 30
        }
    }
})

data class Person(
    val name: String,
    val age: Int
)