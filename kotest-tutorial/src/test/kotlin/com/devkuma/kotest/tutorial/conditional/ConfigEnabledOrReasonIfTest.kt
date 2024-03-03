package com.devkuma.kotest.tutorial.conditional

import io.kotest.core.spec.style.StringSpec
import io.kotest.core.test.Enabled
import io.kotest.core.test.TestCase
import org.apache.commons.lang3.SystemUtils

class ConfigEnabledOrReasonIfTest : StringSpec({

    val disableDangerOnFridays: (TestCase) -> Enabled = {
        if (it.name.testName.startsWith("danger") || SystemUtils.IS_OS_LINUX)
            Enabled.disabled("It's a linux, and we don't like danger!")
        else
            Enabled.enabled
    }

    "danger Will Robinson".config(enabledOrReasonIf = disableDangerOnFridays) {
        // test here
    }

    "safe Will Robinson".config(enabledOrReasonIf = disableDangerOnFridays) {
        // test here
    }
})