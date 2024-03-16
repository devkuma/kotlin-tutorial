package com.devkuma.kotest.tutorial.extensions.kafka.ex3

import io.kotest.assertions.nondeterministic.eventually
import io.kotest.core.spec.style.FunSpec
import io.kotest.extensions.embedded.kafka.embeddedKafkaListener
import io.kotest.matchers.shouldBe
import org.apache.kafka.clients.producer.ProducerRecord
import java.time.Duration
import java.time.temporal.ChronoUnit
import kotlin.time.Duration.Companion.seconds

class EmbeddedKafkaListenerTest : FunSpec({

    listener(embeddedKafkaListener)

    test("send / receive") {

        val producer = embeddedKafkaListener.stringStringProducer()
        producer.send(ProducerRecord("foo", "a"))
        producer.close()

        val consumer = embeddedKafkaListener.stringStringConsumer("foo")
        eventually(10.seconds) {
            consumer.poll(Duration.of(1, ChronoUnit.SECONDS)).first().value() shouldBe "a"
        }
        consumer.close()
    }
})

