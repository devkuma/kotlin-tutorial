package com.devkuma.kotest.tutorial.framework.tags

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.core.annotation.Tags

@Tags("SlowTest")
class SlowTests : ShouldSpec({})