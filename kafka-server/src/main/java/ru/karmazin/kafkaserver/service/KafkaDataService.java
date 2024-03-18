package ru.karmazin.kafkaserver.service;

import ru.karmazin.kafkacore.model.Data;

public interface KafkaDataService {
    void send(Data data);
}
