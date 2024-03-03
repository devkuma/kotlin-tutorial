package com.devkuma.kotest.tutorial.datadriven

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData

class NestedDataTest2 : FunSpec({

    context("each service should support all http methods") {

        val services = listOf(
            "http://internal.foo",
            "http://internal.bar",
            "http://public.baz",
        )

        val methods = listOf("GET", "POST", "PUT")

        withData(services) { service ->
            withData<String>({ "should support HTTP $it" }, methods) { method ->
                // test service against method
            }
        }
    }
})