package com.devkuma.kotest.tutorial.framework.ordering

import io.kotest.core.config.AbstractProjectConfig
import io.kotest.core.spec.SpecExecutionOrder
import io.kotest.core.spec.style.FunSpec

class LexicographicConfig: AbstractProjectConfig() {
    override val specExecutionOrder = SpecExecutionOrder.Lexicographic
}

class AlphaTest : FunSpec({
    test("alpha") {
        println("AlphaTest")
    }
})

class BetaTest : FunSpec({
    test("beta") {
        println("BetaTest")
    }
})

class GammaTest : FunSpec({
    test("gamma") {
        println("GammaTest")
    }
})


class DeltaTest : FunSpec({
    test("delta") {
        println("DeltaTest")
    }
})
