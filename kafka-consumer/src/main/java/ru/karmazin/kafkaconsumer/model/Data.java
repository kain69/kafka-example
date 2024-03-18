package ru.karmazin.kafkaconsumer.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class Data {
    private Long sensorId;
    private LocalDateTime timestamp;
    private Double measurement;
    private MeasurementType measurementType;

    public enum MeasurementType {
        TEMPERATURE,
        VOLTAGE,
        POWER
    }

    @Override
    public String toString() {
        return "Data{" +
                "sensorId=" + sensorId +
                ", timestamp=" + timestamp +
                ", measurement=" + measurement +
                ", measurementType=" + measurementType +
                '}';
    }
}
