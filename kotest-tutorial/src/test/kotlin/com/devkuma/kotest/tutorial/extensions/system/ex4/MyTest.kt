package com.devkuma.kotest.tutorial.extensions.system.ex4

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FreeSpec
import io.kotest.extensions.system.SpecSystemExitListener
import io.kotest.extensions.system.SystemExitException
import io.kotest.matchers.shouldBe

class MyTest : FreeSpec() {

    override fun listeners() = listOf(SpecSystemExitListener)

    init {
        "Catch exception" {
            val thrown: SystemExitException = shouldThrow<SystemExitException> {
                System.exit(22)
            }

            thrown.exitCode shouldBe 22
        }
    }
}