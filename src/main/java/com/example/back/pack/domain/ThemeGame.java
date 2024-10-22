package com.example.back.pack.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class ThemeGame {
    private String name;
    private List<QuestionParams> questions;
}
