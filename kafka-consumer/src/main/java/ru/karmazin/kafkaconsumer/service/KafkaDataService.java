package ru.karmazin.kafkaconsumer.service;

import ru.karmazin.kafkacore.model.Data;

public interface KafkaDataService {
    void listen(Data data);
}
