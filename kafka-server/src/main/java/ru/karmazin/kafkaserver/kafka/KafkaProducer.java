package ru.karmazin.kafkaserver.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaProducer<T> {
    private final KafkaTemplate<String, T> kafkaTemplate;

    public void sendData(String topic, T data) {
        kafkaTemplate.send(topic, data);
    }
}
