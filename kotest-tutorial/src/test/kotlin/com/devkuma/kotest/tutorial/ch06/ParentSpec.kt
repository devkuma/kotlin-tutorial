package com.devkuma.kotest.tutorial.ch06

import com.devkuma.kotest.docs.framework.configurations.KotestProjectConfig.tagInheritance
import io.kotest.core.spec.style.StringSpec
import io.kotest.core.annotation.Tags

@Tags("fast", "unit")  // 부모 클래스에 "fast"와 "unit" 태그 지정
open class ParentSpec : StringSpec({
    "부모 테스트 1" {
        // 이 테스트는 "fast"와 "unit" 태그를 가짐
    }
})