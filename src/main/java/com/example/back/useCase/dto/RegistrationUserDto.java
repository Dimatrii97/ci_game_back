package com.example.back.useCase.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class RegistrationUserDto {
    private List<String> name;
}
