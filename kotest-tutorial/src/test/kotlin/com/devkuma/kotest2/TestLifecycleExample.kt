//package com.devkuma.kotest2
//
//import io.kotest.core.spec.style.StringSpec
//import io.kotest.core.test.TestCase
//import io.kotest.core.test.TestResult
//
//class TestLifecycleExample : StringSpec() {
//
//    override fun beforeTest(testCase: TestCase) {
//        println("테스트 시작: ${testCase.displayName}")
//        // 테스트 전 초기화 작업
//    }
//
//    override fun afterTest(testCase: TestCase, result: TestResult) {
//        println("테스트 종료: ${testCase.displayName}")
//        // 테스트 후 정리 작업
//    }
//
//    init {
//        "첫 번째 테스트" {
//            println("테스트 내용 실행 중")
//        }
//
//        "두 번째 테스트" {
//            println("두 번째 테스트 내용 실행 중")
//        }
//    }
//}