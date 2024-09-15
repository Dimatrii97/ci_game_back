package com.example.back.configs;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ContentQuestion {
    private ContentType type;
    private String value;
    private List<String> right;
    private Boolean isRef;
    private String comment;
}
