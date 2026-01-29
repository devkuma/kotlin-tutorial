package com.devkuma.kotest.tutorial.ch06

import io.kotest.core.spec.style.FunSpec

class TagsSlowTest : FunSpec({

    tags(slow)

    test("느린 테스트") {
        println("느린 테스트")
    } // 테스트에 태그를 지정하기 않아도, Slow 태그가 지정된다.
})