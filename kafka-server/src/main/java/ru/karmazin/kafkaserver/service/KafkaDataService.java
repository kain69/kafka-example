package ru.karmazin.kafkaserver.service;

import ru.karmazin.kafkaserver.model.Data;

public interface KafkaDataService {
    void send(Data data);
}
