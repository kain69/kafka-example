package ru.karmazin.kafkacore.model.test;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.karmazin.kafkacore.model.Data;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptions {
    private int delayInSeconds;
    private Data.MeasurementType[] measurementTypes;
}
