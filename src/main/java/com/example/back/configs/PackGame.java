package com.example.back.configs;


import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class PackGame {
    private String name;
    private String id;
    private List<String> tags;
    private List<Round> rounds;
}
