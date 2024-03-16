package com.devkuma.kotest.tutorial.framework.output

import io.kotest.core.config.AbstractProjectConfig
import io.kotest.core.spec.style.DescribeSpec

class MyTests : DescribeSpec({

    beforeTest {
        println(it.name.testName)
    }

    describe("describe 1") {
        it("test 1") { }
        it("test 2") { }
    }
})

object KotestProjectConfig : AbstractProjectConfig() {
    override var displayFullTestPath: Boolean? = false
}