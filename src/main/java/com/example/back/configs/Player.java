package com.example.back.configs;

import lombok.Builder;

@Builder
public class Player {
    private Integer id;
    private String name;
    private Long count;
}
