package com.example.back.packStructure;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.ArrayList;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Root {
    public String name;
    public String date;
    public int difficulty;
    public int version;
    public String id;
    public ArrayList<String> tags;
    public Global global;
    public ArrayList<Round> rounds;
    public PertInfo info;
}
