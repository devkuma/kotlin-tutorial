package com.devkuma.kotest.tutorial.framework.extensions.ex2

import io.kotest.core.spec.style.FunSpec

class ProjectTest1 : FunSpec({
    test("test1") {
        println("test1")
    }
})

class ProjectTest2 : FunSpec({
    test("test2") {
        println("test2")
    }
})