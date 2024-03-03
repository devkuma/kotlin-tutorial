package com.devkuma.kotest.tutorial.conditional

import io.kotest.core.spec.style.DescribeSpec

class XMethodTest : DescribeSpec({

    xdescribe("이 블록과 그 하위 항목은 이제 비활성화되었다.") {
        it("이 테스트는 실행되지 않습니다") {
            // disabled test
        }
    }
})