package yeo.chi.kafka.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import yeo.chi.kafka.kafka.ExampleProducer

@RestController
@RequestMapping("api/v1/examples")
class ExamController(
    private val exampleProducer: ExampleProducer,
) {
    @GetMapping
    suspend fun get(message: String) = exampleProducer.sendMessage(message = message)
}
