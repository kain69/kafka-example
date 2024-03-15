package ru.karmazin.kafkaserver.web.mapper;

import org.mapstruct.Mapper;
import ru.karmazin.kafkaserver.model.Data;
import ru.karmazin.kafkaserver.web.dto.DataDto;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {
}
