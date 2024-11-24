package yeo.chi.kafka.kafka

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class ExampleConsumer {
    @KafkaListener(topics = ["exam-topic"], groupId = "foo")
    fun consume(message: String) = println("consumed... $message")
}
