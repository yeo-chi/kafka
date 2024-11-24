package yeo.chi.kafka.kafka

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Component
class ExampleProducer(
    private val kafkaTemplate: KafkaTemplate<String, String>,
) {
    companion object {
        const val TOPIC = "exam-topic"
    }

    suspend fun sendMessage(message: String) = kafkaTemplate.send(TOPIC, message)
}
