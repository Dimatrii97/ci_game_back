package com.example.back.packStructure;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class NumberSetValue {
    public int minimum;
    public int maximum;
}
