package com.example.demo.kafka.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumerService {
    private String lastReceivedMessage; // Храним последнее сообщение

    @KafkaListener(topics = "my-topic")
    public void listen(String message) {
        log.info("Received message: {}", message);
        this.lastReceivedMessage = message; // Сохраняем сообщение
    }

    // Добавляем геттер для тестов
    public String getLastReceivedMessage() {
        return lastReceivedMessage;
    }
}

