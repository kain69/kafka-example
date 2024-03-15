package ru.karmazin.kafkaserver.model.test;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.karmazin.kafkaserver.model.Data;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptions {
    private int delayInSeconds;
    private Data.MeasurementType[] measurementTypes;
}
