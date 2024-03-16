package com.devkuma.kotest.tutorial.framework.tags.ex2

import com.devkuma.kotest.tutorial.framework.tags.ex1.Linux
import com.devkuma.kotest.tutorial.framework.tags.ex1.Windows
import io.kotest.core.spec.style.StringSpec

class TagConfigTest : StringSpec() {
    init {
        "should run on Windows".config(tags = setOf(Windows)) {
            // ...
            println("should run on Windows")
        }

        "should run on Linux".config(tags = setOf(Linux)) {
            // ...
            println("should run on Linux")
        }

        "should run on Windows and Linux".config(tags = setOf(Windows, Linux)) {
            // ...
            println("should run on Windows and Linux")
        }
    }
}