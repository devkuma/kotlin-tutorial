package com.devkuma.kotest.tutorial.ch02

import io.kotest.core.spec.style.StringSpec

class InitTest : StringSpec() {
    init {
        "This is a test" {
            // 테스트 코드 작성
        }
    }
}