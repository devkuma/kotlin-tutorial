package com.devkuma.kotest.tutorial.extensions.ex1

import io.kotest.core.listeners.AfterSpecListener
import io.kotest.core.listeners.BeforeSpecListener
import io.kotest.core.spec.Spec

class MyTestListener : BeforeSpecListener, AfterSpecListener {
    override suspend fun beforeSpec(spec: Spec) {
        println("beforeSpec")
    }
    override suspend fun afterSpec(spec: Spec) {
        println("afterSpec")
    }
}