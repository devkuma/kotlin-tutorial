package com.devkuma.kotest.tutorial.framework.coroutines.ex1

import io.kotest.core.spec.style.FunSpec

class TestDispatcherTest : FunSpec() {
    init {
        test("foo").config(coroutineTestScope = true) {
            // this test will run with a test dispatcher
        }
    }
}