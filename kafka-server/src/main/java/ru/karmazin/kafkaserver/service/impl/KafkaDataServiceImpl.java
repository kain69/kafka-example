package ru.karmazin.kafkaserver.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.karmazin.kafkaserver.kafka.KafkaProducer;
import ru.karmazin.kafkaserver.model.Data;
import ru.karmazin.kafkaserver.service.KafkaDataService;

@Service
@RequiredArgsConstructor
public class KafkaDataServiceImpl implements KafkaDataService {
    private final KafkaProducer<Data> kafkaProducer;

    @Override
    public void send(Data data) {
        String topic = switch (data.getMeasurementType()) {
            case TEMPERATURE -> "data-temperature";
            case VOLTAGE -> "data-voltage";
            case POWER -> "data-power";
        };
        kafkaProducer.sendData(topic, data);
    }
}
