package com.devkuma.kotest.tutorial.framework.conditional

import io.kotest.core.spec.style.StringSpec
import io.kotest.core.test.EnabledIf
import org.apache.commons.lang3.SystemUtils.IS_OS_LINUX

class ConfigEnabledIfTest : StringSpec({

    val disableDangerOnNotLinux: EnabledIf = { !it.name.testName.startsWith("danger") || IS_OS_LINUX }

    "danger will robinson".config(enabledIf = disableDangerOnNotLinux) {
        // test here
    }

    "very safe will".config(enabledIf = disableDangerOnNotLinux) {
        // test here
    }
})