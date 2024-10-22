package com.example.back.packStructure;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Parameters {
    public Question question;
    public SelectionMode selectionMode;
    public Price price;
    public AnswerType answerType;
    public AnswerOptions answerOptions;
    public Question answer;
}
