package com.example.back.pack.mapper;

import com.example.back.configs.mapper.MapStructConfig;
import com.example.back.pack.domain.QuestionParams;
import com.example.back.pack.domain.ThemeGame;
import com.example.back.packStructure.QuestionParameters;
import com.example.back.packStructure.Theme;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = MapStructConfig.class)
public abstract class ThemeMapper {

    @Mapping(source = "questions", target = "questions", qualifiedByName = "questionParameters")
    public abstract ThemeGame themeToThemeGame(Theme theme);

    @Named("questionParameters")
    public List<QuestionParams> QuestionParametersToQuestionParams(List<QuestionParameters> questionParameters) {
        return Mappers.getMapper(QuestionParamsMapper.class).parametersToQuestionParams(questionParameters);
    }
}
