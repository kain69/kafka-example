package ru.karmazin.kafkaserver.web.mapper;

import org.mapstruct.Mapper;
import ru.karmazin.kafkacore.model.test.DataTestOptions;
import ru.karmazin.kafkacore.web.dto.DataTestOptionsDto;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper extends Mappable<DataTestOptions, DataTestOptionsDto> {

}
