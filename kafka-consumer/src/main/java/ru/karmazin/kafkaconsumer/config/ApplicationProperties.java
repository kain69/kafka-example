package ru.karmazin.kafkaconsumer.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Getter
public class ApplicationProperties {
    @Value(value = "${spring.kafka.bootstrap-servers}")
    private String bootstrapAddress;

    @Value(value = "${topics}")
    private List<String> topics;

    @Value(value = "${groupId}")
    private String groupId;

    public List<String> getTopics() {
        if (topics == null) {
            return List.of();
        }
        return topics;
    }
}
