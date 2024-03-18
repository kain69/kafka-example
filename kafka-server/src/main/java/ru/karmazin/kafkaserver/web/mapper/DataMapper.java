package ru.karmazin.kafkaserver.web.mapper;

import org.mapstruct.Mapper;
import ru.karmazin.kafkacore.model.Data;
import ru.karmazin.kafkacore.web.dto.DataDto;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {
}
