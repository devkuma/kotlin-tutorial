package com.devkuma.kotest.tutorial.framework.tags.ex2

import com.devkuma.kotest.tutorial.framework.tags.ex1.Linux
import com.devkuma.kotest.tutorial.framework.tags.ex1.MySql
import io.kotest.core.spec.style.FunSpec

class TagFuncTest : FunSpec({

    tags(Linux, MySql)

    test("my test") { } // automatically marked with the above tags
})