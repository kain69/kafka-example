package ru.karmazin.kafkaserver.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.karmazin.kafkacore.model.Data;
import ru.karmazin.kafkacore.model.test.DataTestOptions;
import ru.karmazin.kafkacore.web.dto.DataDto;
import ru.karmazin.kafkacore.web.dto.DataTestOptionsDto;
import ru.karmazin.kafkaserver.service.KafkaDataService;
import ru.karmazin.kafkaserver.service.TestDataService;
import ru.karmazin.kafkaserver.web.mapper.DataMapper;
import ru.karmazin.kafkaserver.web.mapper.DataTestOptionsMapper;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {
    private final KafkaDataService kafkaDataService;
    private final TestDataService testDataService;
    private final DataMapper dataMapper;
    private final DataTestOptionsMapper dataTestOptionsMapper;

    @PostMapping("/send")
    public void send(@RequestBody DataDto dto) {
        Data data = dataMapper.toEntity(dto);
        kafkaDataService.send(data);
    }

    @PostMapping("/test/send")
    public void sendPost(@RequestBody DataTestOptionsDto testOptionsDto) {
        DataTestOptions testOptions = dataTestOptionsMapper.toEntity(testOptionsDto);
        testDataService.send(testOptions);
    }
}
