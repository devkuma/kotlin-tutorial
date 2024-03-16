package com.devkuma.kotest.tutorial.framework.isolation

import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.WordSpec
import java.util.*

class InstancePerLeafExample : WordSpec() {

    override fun isolationMode(): IsolationMode = IsolationMode.InstancePerLeaf

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