package com.devkuma.kotest.tutorial.ch02

import io.kotest.core.spec.style.DescribeSpec

class NestedContextTest : DescribeSpec({
    describe("Calculator") {
        context("when adding two positive numbers") {
            // 이 상황에 대한 테스트 작성
        }
    }
})