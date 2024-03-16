package com.devkuma.kotest.tutorial.assertions.clues

import io.kotest.assertions.asClue
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

class ClueTest : StringSpec({

    val user = User(null, "devkuma")

    "test0" {
        val username = "devkuma@devkuma.com"

        username shouldBe "devkuma"
    }

    "test1" {
        withClue("Name should be present") {
            user.name shouldNotBe null
        }
    }

    "test2" {
        withClue({ "Name should be present (user_id=${user.id})" }) {
            user.name shouldNotBe null
        }

    }

    "test3" {
        { "Name should be present (user_id=${user.id})" }.asClue {
            user.name shouldNotBe null
        }
    }
})

data class User(
    val name: String?,
    val id: String,
)