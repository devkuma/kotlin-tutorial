package com.devkuma.kotest.tutorial.extensions.system.ex3

import io.kotest.core.spec.style.FreeSpec
import io.kotest.extensions.system.SecurityManagerListener

class MyTest : FreeSpec() {

    //override fun listeners() = listOf(SecurityManagerListener(myManager))

    init {
        // Use my security manager
    }
}