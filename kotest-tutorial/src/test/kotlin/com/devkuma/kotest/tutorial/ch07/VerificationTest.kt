package com.devkuma.kotest.tutorial.ch07

import io.kotest.core.spec.style.StringSpec
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify


class PaymentService {
    fun processPayment(amount: Double): Boolean {
        return amount > 0
    }
}

class VerificationTest : StringSpec({

    "Mock 객체 검증" {
        val mockPaymentService = mockk<PaymentService>()

        every { mockPaymentService.processPayment(any()) } returns true

        // 함수 호출
        mockPaymentService.processPayment(100.0)

        // 함수가 호출되었는지 검증
        verify { mockPaymentService.processPayment(100.0) }

        // 함수가 한 번만 호출되었는지 검증
        verify(exactly = 1) { mockPaymentService.processPayment(100.0) }
    }
})