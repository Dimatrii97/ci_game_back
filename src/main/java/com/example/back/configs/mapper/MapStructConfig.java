package com.example.back.configs.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.ReportingPolicy;

@Mapper(config = MapStructConfig.class)
@MapperConfig(componentModel = "spring",
    unmappedTargetPolicy = ReportingPolicy.IGNORE,
    typeConversionPolicy = ReportingPolicy.ERROR)
public interface MapStructConfig {
}
