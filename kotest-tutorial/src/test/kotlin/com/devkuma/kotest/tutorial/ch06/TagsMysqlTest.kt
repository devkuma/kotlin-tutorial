package com.devkuma.kotest.tutorial.ch06

import io.kotest.core.NamedTag
import io.kotest.core.spec.style.StringSpec

class TagsMysqlTest : StringSpec({

    tags(MySql)

    "MySql 테스트" {
        // 이 테스트는 'MySql' 태그가 붙음
    }

    "빠른 테스트".config(tags = setOf(NamedTag("Fast"))) {
        // 이 테스트는 'Fast' 태그가 붙음
    }
})