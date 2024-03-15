package ru.karmazin.kafkatester.service;

import ru.karmazin.kafkatester.model.Data;

public interface KafkaDataService {
    void listen(Data data);
}
