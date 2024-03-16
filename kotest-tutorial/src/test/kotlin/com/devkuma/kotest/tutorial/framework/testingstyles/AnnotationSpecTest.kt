package com.devkuma.kotest.tutorial.framework.testingstyles

import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe

class AnnotationSpecTest : AnnotationSpec() {

    @Test
    fun `AnnotationSpec 예제 - 덧셈 테스트`() {
        val result = 2 + 2
        result shouldBe 4
    }
}