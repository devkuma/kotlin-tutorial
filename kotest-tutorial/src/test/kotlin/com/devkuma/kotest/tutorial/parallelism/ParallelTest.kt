package com.devkuma.kotest.tutorial.parallelism

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import java.time.LocalDateTime

class ParallelTest1 : DescribeSpec({
    describe("Parallel test 1") {
        println("Starting test 1")
        Thread.sleep(2000)
        it("단순한 연산 테스트") {
            1 + 1 shouldBe 2
            println("Test 1 completed")
        }
    }
})

class ParallelTest2 : DescribeSpec({
    describe("Parallel test 2") {
        println("Starting test 2")
        Thread.sleep(2000)
        it("문자열 길이 테스트") {
            "hello".length shouldBe 5
            println("Test 2 completed")
        }
    }
})

class ParallelTest3 : DescribeSpec({
    describe("Parallel test 3") {
        println("Starting test 3")
        Thread.sleep(2000)
        it("리스트 크기 테스트") {
            listOf(1, 2, 3).size shouldBe 3
            println("Test 3 completed")
        }

    }
})

