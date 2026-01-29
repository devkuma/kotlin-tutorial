package com.devkuma.kotest.tutorial.ch06

import io.kotest.core.config.AbstractProjectConfig

class ProjectConfig : AbstractProjectConfig() {
    override val tagInheritance = true
}