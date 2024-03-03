package com.devkuma.kotest.tutorial.resources

import io.kotest.core.spec.style.FunSpec
import io.kotest.engine.spec.tempdir
import io.kotest.matchers.shouldBe

class TempDirTest : FunSpec({

    val dir = tempdir()

    test("a temporary dir dependent test") {
        println(dir.path)

        dir.isDirectory shouldBe true
    }
})