package com.example.back.pack.mapper;

import com.example.back.pack.domain.ContentType;
import com.example.back.packStructure.ContentValue;
import com.example.back.packStructure.Parameters;
import com.example.back.packStructure.Question;
import com.example.back.packStructure.QuestionParameters;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
@AllArgsConstructor
public class QuestionParamsMapperTest {

    private ContentValue getContentType() {
        var cv = new ContentValue();
        cv.setValue("тратата");
        cv.setType("video");
        cv.setWaitForFinish(true);

        return cv;
    }

    private Question getQuestion() {
        var question = new Question();
        question.setType("image");
        question.setContentValue(List.of(getContentType()));

        return question;
    }

    private Parameters getParams() {
        var params = new Parameters();
        params.setQuestion(getQuestion());
        return params;
    }

    @Test
    void QuestionParams_to_QuestionParams() {
        var questionParameters = new QuestionParameters();
        questionParameters.setPrice(500);
        questionParameters.setParameters(getParams());
        var cq = Mappers.getMapper(QuestionParamsMapper.class).parametersToQuestionParams(questionParameters);

        assertEquals(500, cq.getPrice().getValue());
        assertEquals("тратата", cq.getQuestion().get(0).getValue());
        assertEquals(ContentType.VIDEO, cq.getQuestion().get(0).getType());
    }

}
