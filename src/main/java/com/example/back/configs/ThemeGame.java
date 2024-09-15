package com.example.back.configs;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ThemeGame {
    private String name;
    private List<Question> questions;
}
