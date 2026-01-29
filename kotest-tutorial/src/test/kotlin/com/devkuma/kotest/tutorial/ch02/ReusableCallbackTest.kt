package com.devkuma.kotest.tutorial.ch02

import io.kotest.core.spec.BeforeTest
import io.kotest.core.spec.style.FunSpec

val resetDatabase: BeforeTest = {
    // truncate all tables here
}

class ReusableCallbackTest : FunSpec({

    beforeTest(resetDatabase)

    test("this test will have a sparkling clean database!") {
        // test logic here
    }
})