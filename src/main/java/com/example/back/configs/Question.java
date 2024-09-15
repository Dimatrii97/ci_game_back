package com.example.back.configs;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Question {
    private Price price;
    private List<String> right;
    private ContentQuestion question;
    private ContentQuestion answer;
}
