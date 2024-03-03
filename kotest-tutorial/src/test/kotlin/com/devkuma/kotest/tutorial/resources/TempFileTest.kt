package com.devkuma.kotest.tutorial.resources

import io.kotest.core.spec.style.FunSpec
import io.kotest.engine.spec.tempfile
import io.kotest.matchers.shouldBe

class TempFileTest : FunSpec({

    val file = tempfile()

    test("a temporary file dependent test") {
        println(file.path)

        file.isFile shouldBe true
    }
})