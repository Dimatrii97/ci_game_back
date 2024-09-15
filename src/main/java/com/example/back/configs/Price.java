package com.example.back.configs;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Price {
    private TypePrice type;
    private Integer value;
    private Integer step;
    private NumberSet numberSet;
}
