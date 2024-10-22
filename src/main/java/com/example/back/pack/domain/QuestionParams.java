package com.example.back.pack.domain;

import com.example.back.packStructure.SelectionMode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class QuestionParams {
//    переделать на enum
    public String typeName;
    private Price price;
    private SelectionMode selectionMode;
    private List<String> right;
    private List<ContentQuestion> question;
    private List<ContentQuestion> answer;
}
