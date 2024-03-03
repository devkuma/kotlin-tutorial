package com.devkuma.kotest.tutorial.conditional

import io.kotest.core.annotation.Ignored
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Ignored
class IgnoredTest : StringSpec({
    "이 테스트는 실행되지 않는다" {
        // 이 테스트는 실행되지 않는다.
        1 + 1 shouldBe 3
    }
}) {
    init {
        error("boom") // 스펙 생성되지 않으므로 이 오류가 발생하지 않는다.
    }
}