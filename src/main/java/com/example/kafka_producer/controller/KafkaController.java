package com.example.kafkaproducer.controller;

import com.example.kafkaproducer.service.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    @Autowired
    private MessageProducer producer;

    @PostMapping("/publish")
    public String sendMessage(@RequestBody Map<String, String> payload) {
        String message = payload.get("message");
        producer.sendMessage(message);
        return "Message sent to Kafka topic";
    }
}
