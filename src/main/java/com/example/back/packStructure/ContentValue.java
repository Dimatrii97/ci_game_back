package com.example.back.packStructure;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentValue {
    public String placement;
    public String type;
    public String value;
    public boolean waitForFinish;
    public boolean isRef;
}
