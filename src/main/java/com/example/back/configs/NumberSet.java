package com.example.back.configs;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NumberSet {
    private Integer min;
    private Integer max;
}
