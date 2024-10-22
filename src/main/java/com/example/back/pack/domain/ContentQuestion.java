package com.example.back.pack.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ContentQuestion {
    private ContentType type;
    private String value;
    public boolean waitForFinish;
}
