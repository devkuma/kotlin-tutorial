package com.devkuma.kotest.tutorial.ch04

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.collections.shouldContainAll
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.collections.shouldNotBeEmpty

class ShouldListTest : StringSpec({
    val list = listOf(1, 2, 3, 4, 5)

    "리스트는 특정 요소들을 모두 포함해야 한다" {
        list shouldContain 2 // 리스트 2를 포함하고 있는지 확인
        list shouldContainAll listOf(2, 3)  // 리스트가 2와 3을 모두 포함하는지 확인
    }

    "리스트는 5개의 요소를 가져야 한다" {
        list shouldHaveSize 5  // 리스트 크기 확인
    }

    "리스트가 비어 있어야 한다." {
        val emptyList = emptyList<Int>()
        emptyList.shouldNotBeEmpty()
    }
})