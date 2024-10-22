package com.example.back.pack.domain;


import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class PackGame {
    private String name;
    private List<String> tags;
    private List<Round> rounds;
}
