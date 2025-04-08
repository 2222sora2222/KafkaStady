package com.example.demo.kafka.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j; // Добавляем правильный импорт
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j // Добавляем эту аннотацию для создания логгера
public class KafkaProducerService {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
        log.info("Sent message: {} to topic: {}", message, topic);
    }
}