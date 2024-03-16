package com.devkuma.kotest.tutorial.framework.tags.ex3

import io.kotest.core.spec.style.FreeSpec
import io.kotest.core.annotation.Tags

@Tags("fast")
class MyFastTests : FreeSpec({
    "테스트 1" {
        // 테스트 내용
    }
})

@Tags("slow")
class MySlowTests : FreeSpec({
    "테스트 2" {
        // 테스트 내용
    }
})