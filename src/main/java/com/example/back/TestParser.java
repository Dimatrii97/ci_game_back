package com.example.back;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class TestParser {
    private Integer id;
    private String value;
    private ArrayList<ItemTest> menuitem;
}
