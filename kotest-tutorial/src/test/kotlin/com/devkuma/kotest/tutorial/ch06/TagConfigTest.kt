package com.devkuma.kotest.tutorial.ch06

import io.kotest.core.spec.style.StringSpec

class TagConfigTest : StringSpec({
    "MySql 테스트".config(tags = setOf(MySql)) {
        // 이 테스트는 'MySql' 태그가 붙음
        println("MySql 테스트 실행")
    }

    "느린 테스트".config(tags = setOf(slow)) {
        // 이 테스트는 'Show' 태그가 붙음
        println("Show 테스트 실행")
    }

    "MySQL이며서, 느린 테스트".config(tags = setOf(MySql, slow)) {
        // 이 테스트는 'MySQL'와 'Show' 태그가 붙음
        println("MySQL이며서, 느린 테스트 실행")
    }
})