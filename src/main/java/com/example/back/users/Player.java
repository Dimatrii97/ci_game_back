package com.example.back.users;

import lombok.Builder;

@Builder
public class Player {
    private Integer id;
    private String name;
    private Long count;
}
