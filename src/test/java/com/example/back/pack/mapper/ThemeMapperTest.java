package com.example.back.pack.mapper;

import com.example.back.packStructure.*;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
@AllArgsConstructor
public class ThemeMapperTest {

    private final ThemeMapper mapper = Mappers.getMapper(ThemeMapper.class);

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

    private List<QuestionParameters> getQuestionParamerts() {
        var questionParameters = new QuestionParameters();
        questionParameters.setPrice(500);
        questionParameters.setParameters(getParams());

        return List.of(questionParameters);
    }

    @Test
    public void themeToThemeGame() {
        var theme = new Theme();
        theme.setQuestions(getQuestionParamerts());
        theme.setName("Вая");
        var themeGame = mapper.themeToThemeGame(theme);

        assertEquals("Вая", themeGame.getName());
    }
}
