package com.devkuma.kotest.tutorial.conditional

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class FocusTest: StringSpec({
    "이 테스트는 Focus되지 않는다" {
        // 이 테스트는 실행되지 않는다.
        1 + 1 shouldBe 2
    }

    // 이 테스트는 Focus되어 실행된다.
    "f:를 사용한 Focus 예제" {
        1 + 1 shouldBe 2
    }

    "이 테스트도 Focus되지 않습니다" {
        // 이 테스트는 실행되지 실행된다.
        1 + 1 shouldBe 2
    }
})