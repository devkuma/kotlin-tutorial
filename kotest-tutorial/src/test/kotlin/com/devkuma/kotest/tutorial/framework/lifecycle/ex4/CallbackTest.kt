package com.devkuma.kotest.tutorial.framework.lifecycle.ex4

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class CallbackTest : StringSpec({

    // 각 스펙이 실행되기 전에 호출되는 콜백
    beforeSpec {
        println("beforeSpec: 스펙 실행 전 설정을 수행.")
        // 스펙 전체에 대한 설정 작업을 추가.
    }

    // 각 스펙이 실행된 후에 호출되는 콜백
    afterSpec {
        println("afterSpec: 스펙 실행 후 정리를 수행.")
        // 스펙 전체에 대한 정리 작업을 추가.
    }

    // 각 테스트 실행 전에 호출되는 콜백
    beforeTest { testCase ->
        println("beforeTest: ${testCase.name.testName} 실행 전 설정을 수행.")
        // 여기에 테스트의 공통 설정 작업을 추가.
    }

    // 각 테스트 실행 후에 호출되는 콜백
    afterTest { (testCase, testResult) ->
        println("afterTest: ${testCase.name.testName} 실행 후 정리를 수행. 결과: $testResult")
        // 여기에 테스트의 공통 정리 작업을 추가.
    }

    // 모든 테스트가 실행되기 전에 호출되는 콜백
    beforeAny { testCase ->
        println("beforeAny: ${testCase.name.testName} 테스트 실행 전 설정을 수행.")
        // 여기에 모든 테스트에 대한 공통 설정 작업을 추가다.
    }

    // 모든 테스트가 실행된 후에 호출되는 콜백
    afterAny { (testCase, testResult) ->
        println("afterAny:${testCase.name.testName} 테스트 실행 후 정리를 수행. 결과: $testResult")
        // 여기에 모든 테스트에 대한 공통 정리 작업을 추가.
    }

    // 각 테스트 실행 전에 호출되는 콜백
    beforeEach { testCase ->
        println("beforeEach: ${testCase.name.testName} 테스트 실행 전 설정을 수행.")
        // 여기에 테스트의 개별 설정 작업을 추가.
    }

    // 각 테스트 실행 후에 호출되는 콜백
    afterEach { (testCase, testResult) ->
        println("afterEach: ${testCase.name.testName} 테스트 실행 후 정리를 수행. 결과: $testResult")
        // 여기에 테스트의 개별 정리 작업을 추가.
    }

    // 테스트 케이스 1
    "TestCase1" {
        println("TestCase1 실행.")
        val result = 2 + 2
        result shouldBe 4
    }

    // 테스트 케이스 2
    "TestCase2" {
        println("'TestCase2' 실행.")
        val list = mutableListOf<Int>()
        list.add(1)
        list.add(2)
        list.size shouldBe 2
    }
})
