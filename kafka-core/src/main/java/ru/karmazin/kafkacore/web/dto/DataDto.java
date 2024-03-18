package ru.karmazin.kafkacore.web.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.karmazin.kafkacore.model.Data;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class DataDto {
    private Long sensorId;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime timestamp;
    private Double measurement;
    private Data.MeasurementType measurementType;
}
