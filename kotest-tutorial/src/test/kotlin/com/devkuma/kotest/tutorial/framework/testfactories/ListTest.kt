package com.devkuma.kotest.tutorial.framework.testfactories

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class ListTest : WordSpec({

    val empty = IndexedSeqList<Int>()

    "List" should {
        "increase size as elements are added" {
            empty.size() shouldBe 0
            val plus1 = empty.add(1)
            plus1.size() shouldBe 1
            val plus2 = plus1.add(2)
            plus2.size() shouldBe 2
        }
        "contain an element after it is added" {
            empty.contains(1) shouldBe false
            empty.add(1).contains(1) shouldBe true
            empty.add(1).contains(2) shouldBe false
        }
    }
})