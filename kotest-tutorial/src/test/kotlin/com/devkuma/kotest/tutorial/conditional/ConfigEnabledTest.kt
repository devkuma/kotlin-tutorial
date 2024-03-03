package com.devkuma.kotest.tutorial.conditional

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.apache.commons.lang3.SystemUtils.IS_OS_LINUX
import org.apache.commons.lang3.SystemUtils.IS_OS_MAC

class ConfigEnabledTest : StringSpec({

    "항상 실행".config(enabled = true) {
        // 이 테스트는 항상 실행되지 않는다.
        1 + 1 shouldBe 2
    }

    "항상 실행 안됨".config(enabled = false) {
        // 이 테스트는 항상 실행되지 않는다.
        1 + 1 shouldBe 3
    }

    "리눅스인 경우만 실행".config(enabled = IS_OS_LINUX) {
        // 이 테스트는 리눅스인 경우에는 실행된다.
    }

    "맥인 경우만 실행".config(enabled = IS_OS_MAC) {
        // 이 테스트는 맥인 경우에는 실행된다.
    }
})
