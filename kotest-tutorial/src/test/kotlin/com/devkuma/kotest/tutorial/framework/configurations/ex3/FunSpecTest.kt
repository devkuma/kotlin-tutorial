package com.devkuma.kotest.tutorial.framework.configurations.ex3

import io.kotest.core.spec.style.FunSpec
import io.kotest.core.Tag

class FunSpecTest : FunSpec() {
    init {
        test("FunSpec should support config syntax").config(tags = setOf(Database, Linux)) {
            // ...
        }
    }
}

object Database : Tag()
object Linux : Tag()