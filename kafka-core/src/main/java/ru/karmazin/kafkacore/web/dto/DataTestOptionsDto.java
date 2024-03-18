package ru.karmazin.kafkacore.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.karmazin.kafkacore.model.Data;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptionsDto {
    private int delayInSeconds;
    private Data.MeasurementType[] measurementTypes;
}
