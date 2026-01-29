package com.devkuma.kotest.docs.extensions.kafka.ex2

import io.kotest.core.spec.style.FunSpec
import io.kotest.extensions.embedded.kafka.embeddedKafkaListener

class EmbeddedKafkaListenerTest : FunSpec() {
    init {
        listener(embeddedKafkaListener)
    }
}