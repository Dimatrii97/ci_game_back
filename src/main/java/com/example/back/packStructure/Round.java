package com.example.back.packStructure;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.ArrayList;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Round {
    public String name;
    public ArrayList<Theme> themes;
    public String type;
}
