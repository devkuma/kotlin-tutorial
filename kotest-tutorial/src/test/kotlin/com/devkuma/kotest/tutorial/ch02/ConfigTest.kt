package com.devkuma.kotest.tutorial.ch02

import io.kotest.core.Tag
import io.kotest.core.spec.style.StringSpec
import kotlin.time.Duration.Companion.seconds

class ConfigTest : StringSpec({
    "should use config".config(timeout = 2.seconds, invocations = 10, threads = 2, tags = setOf(Database, Linux)) {
        // test here
    }
})

object Database : Tag()
object Linux : Tag()
