package com.devkuma.kotest.tutorial.framework.extensions.ex2

import io.kotest.core.listeners.AfterProjectListener
import io.kotest.core.listeners.BeforeProjectListener

//@AutoScan
class ProjectListener : BeforeProjectListener, AfterProjectListener {
    override suspend fun beforeProject() {
        println("beforeProject")
    }

    override suspend fun afterProject() {
        println("afterProject")
    }
}

