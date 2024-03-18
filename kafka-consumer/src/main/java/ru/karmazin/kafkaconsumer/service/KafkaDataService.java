package ru.karmazin.kafkaconsumer.service;

import ru.karmazin.kafkaconsumer.model.Data;

public interface KafkaDataService {
    void listen(Data data);
}
