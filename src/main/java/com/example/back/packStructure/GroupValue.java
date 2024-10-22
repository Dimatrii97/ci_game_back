package com.example.back.packStructure;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupValue {
    @JsonProperty("A")
    public Question a;
    @JsonProperty("B")
    public Question b;
    @JsonProperty("C")
    public Question c;
    @JsonProperty("D")
    public Question d;
}
