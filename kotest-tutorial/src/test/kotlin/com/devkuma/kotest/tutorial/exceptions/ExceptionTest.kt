package com.devkuma.kotest.tutorial.exceptions

import io.kotest.assertions.throwables.shouldNotThrow
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class ExceptionTest : FreeSpec({

    "예외 발생 테스트" - {
        "예외가 발생하는 경우" {
            // 예외가 발생하는 코드를 실행하고 해당 예외를 잡습니다.
            val errorProneFunction: () -> Unit = {
                throw IllegalArgumentException("예외 발생!")
            }
            val exception = shouldThrow<IllegalArgumentException> {
                errorProneFunction()
            }

            // 예상한 예외가 발생한 경우 테스트를 통과합니다.
            exception.message shouldBe "예외 발생!"
        }

        "예외가 발생하지 않는 경우" {
            // 예외가 발생하지 않는 코드를 실행하고 예외가 발생하지 않음을 확인합니다.
            val safeFunction: () -> Unit = {}
            val exception = shouldNotThrow<IllegalArgumentException> {
                safeFunction()
            }

            // 예외가 발생하지 않은 경우 테스트를 통과합니다.
            exception shouldBe null
        }
    }
})