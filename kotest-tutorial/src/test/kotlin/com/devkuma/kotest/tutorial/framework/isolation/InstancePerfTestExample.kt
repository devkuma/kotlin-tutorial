package com.devkuma.kotest.tutorial.framework.isolation

import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.WordSpec
import java.util.*

class InstancePerfTestExample : WordSpec() {

    override fun isolationMode(): IsolationMode = IsolationMode.InstancePerTest

    private val id = UUID.randomUUID()

    init {
        "a" should {
            println("a: $id")
            "b" {
                println("b: $id")
            }
            "c" {
                println("c: $id")
            }
        }
    }
}