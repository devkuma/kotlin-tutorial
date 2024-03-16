package com.devkuma.kotest.tutorial.extensions.kafka.ex1

import io.kotest.core.spec.style.FunSpec
import io.kotest.extensions.embedded.kafka.embeddedKafkaListener

class EmbeddedKafkaListenerTest : FunSpec({
    listener(embeddedKafkaListener)
})