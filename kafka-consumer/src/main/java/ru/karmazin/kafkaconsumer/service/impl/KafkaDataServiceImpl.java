package ru.karmazin.kafkaconsumer.service.impl;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.karmazin.kafkaconsumer.model.Data;
import ru.karmazin.kafkaconsumer.service.KafkaDataService;

@Service
@RequiredArgsConstructor
public class KafkaDataServiceImpl implements KafkaDataService {
    private final Logger log = LoggerFactory.getLogger(KafkaDataService.class);

    @KafkaListener(topics = "#{applicationProperties.getTopics()}",
            groupId = "#{applicationProperties.getGroupId()}")
    public void listen(Data data) {
        log.info(data.toString());
    }

}
