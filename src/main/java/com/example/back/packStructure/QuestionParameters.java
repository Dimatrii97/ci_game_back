package com.example.back.packStructure;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;


import java.util.List;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuestionParameters {
    public int price;
    public Parameters parameters;
    public List<String> right;
    public String typeName;
    public PertInfo info;
}
