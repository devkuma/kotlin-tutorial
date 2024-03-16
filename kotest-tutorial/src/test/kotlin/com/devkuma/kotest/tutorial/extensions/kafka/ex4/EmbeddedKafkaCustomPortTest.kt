package com.devkuma.kotest.tutorial.extensions.kafka.ex4

import io.kotest.assertions.nondeterministic.eventually
import io.kotest.core.spec.style.FunSpec
import io.kotest.extensions.embedded.kafka.EmbeddedKafkaListener
import io.kotest.matchers.shouldBe
import org.apache.kafka.clients.producer.ProducerRecord
import java.time.Duration
import java.time.temporal.ChronoUnit
import kotlin.time.Duration.Companion.seconds

class EmbeddedKafkaCustomPortTest : FunSpec({

    val listener = EmbeddedKafkaListener(5678)
    listener(listener)

    test("send / receive") {

        val producer = listener.stringStringProducer()
        producer.send(ProducerRecord("foo", "a"))
        producer.close()

        val consumer = listener.stringStringConsumer("foo")
        eventually(10.seconds) {
            consumer.poll(Duration.of(1, ChronoUnit.SECONDS)).first().value() shouldBe "a"
        }
        consumer.close()
    }
})