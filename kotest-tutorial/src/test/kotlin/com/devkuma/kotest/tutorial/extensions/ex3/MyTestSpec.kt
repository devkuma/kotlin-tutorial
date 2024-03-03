package com.devkuma.kotest.tutorial.extensions.ex3

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.extensions.system.NoSystemOutListener

class MyTestSpec : DescribeSpec({

    listener(NoSystemOutListener)

    describe("All these tests should not write to standard out") {
        it("silence in the court") {
            println("boom") // failure
        }
    }
})