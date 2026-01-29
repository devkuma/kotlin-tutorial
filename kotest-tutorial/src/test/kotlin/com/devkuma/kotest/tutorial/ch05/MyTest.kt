package com.devkuma.kotest.tutorial.ch05

import io.kotest.core.spec.style.StringSpec

class MyTest : StringSpec({

    beforeTest {
        println("테스트 설정 작업 실행")
        // 테스트에 필요한 리소스 초기화
    }

    afterTest {
        println("테스트 해제 작업 실행")
        // 테스트 이후 리소스 정리
    }

    "example test" {
        // 테스트 코드
    }
})