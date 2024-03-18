package ru.karmazin.kafkaserver.service;

import ru.karmazin.kafkacore.model.test.DataTestOptions;

public interface TestDataService {
    void send(DataTestOptions testOptions);
}
