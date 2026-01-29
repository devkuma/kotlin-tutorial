package com.devkuma.kotest.tutorial.ch06

import io.kotest.core.annotation.RequiresTag
import io.kotest.core.spec.style.FunSpec

@RequiresTag("Linux", "Mysql")
class RequiresTagTest : FunSpec({

    test("RequiresTag 테스트") {
        println("RequiresTag 테스트 실행")
    }
})