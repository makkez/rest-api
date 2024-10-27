package ru.makkez.learn.restapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.makkez.learn.restapi.kafka.KafkaProducer;

@RestController
public class Controller {

    private final KafkaProducer kafkaProducer;

    public Controller(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/kafka/send")
    public String sendMessage(@RequestBody String message) {
        kafkaProducer.send(message);
        return "success";
    }
}
