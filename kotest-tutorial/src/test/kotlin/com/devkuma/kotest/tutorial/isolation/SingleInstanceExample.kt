package com.devkuma.kotest.tutorial.isolation

import io.kotest.core.spec.style.WordSpec
import java.util.*

class SingleInstanceExample : WordSpec({

    val id = UUID.randomUUID()

    "a" should {
        println("a: $id")
        "b" {
            println("b: $id")
        }
        "c" {
            println("c: $id")
        }
    }
})