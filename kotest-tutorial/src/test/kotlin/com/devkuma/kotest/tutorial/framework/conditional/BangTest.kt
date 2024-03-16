package com.devkuma.kotest.tutorial.framework.conditional

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class BangTest : StringSpec({
    "!이 테스트는 실행되지 않는다" {
        // 이 테스트는 실행되지 않는다.
        1 + 1 shouldBe 2
    }

    "이 테스트는 실행된다" {
        // 이 테스트는 실행된다.
        1 + 1 shouldBe 2
    }
})