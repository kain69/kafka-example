package ru.karmazin.kafkaserver.web.mapper;

import org.mapstruct.Mapper;
import ru.karmazin.kafkaserver.model.test.DataTestOptions;
import ru.karmazin.kafkaserver.web.dto.DataTestOptionsDto;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper extends Mappable<DataTestOptions, DataTestOptionsDto> {

}
