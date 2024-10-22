package com.example.back.pack.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class NumberSet {
    private Integer min;
    private Integer max;
}
