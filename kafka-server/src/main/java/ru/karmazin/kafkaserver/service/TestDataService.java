package ru.karmazin.kafkaserver.service;

import ru.karmazin.kafkaserver.model.test.DataTestOptions;

public interface TestDataService {
    void send(DataTestOptions testOptions);
}
