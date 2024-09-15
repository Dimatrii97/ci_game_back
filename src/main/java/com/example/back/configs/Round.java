package com.example.back.configs;

import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class Round {
    private String name;
    private List<ThemeGame> themes;
}
