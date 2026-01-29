package com.devkuma.kotest.tutorial.ch05

import io.kotest.core.spec.style.StringSpec

class BeforeAfterAllTest : StringSpec({

    beforeSpec {
        println("스펙 전체 실행 전 작업")
    }

    afterSpec {
        println("스펙 전체 종료 후 작업")
    }

    beforeEach {
        println("각 테스트 케이스 실행 전 작업: ${it.name.testName}")
    }

    afterEach {
        println("각 테스트 케이스 종료 후 작업: ${it.a.name.testName}")
    }

    "테스트 1" {
        println("테스트 1 실행")
    }

    "테스트 2" {
        println("테스트 2 실행")
    }
})