package com.example.back.pack.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class Round {
    private String name;
    private List<ThemeGame> themes;
    public String type;
}
