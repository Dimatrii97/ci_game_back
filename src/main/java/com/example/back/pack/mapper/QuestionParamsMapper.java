package com.example.back.pack.mapper;

import com.example.back.configs.mapper.MapStructConfig;
import com.example.back.pack.domain.*;
import com.example.back.packStructure.ContentValue;
import com.example.back.packStructure.Parameters;
import com.example.back.packStructure.Question;
import com.example.back.packStructure.QuestionParameters;
import com.example.back.utils.ApplyIfNotNull;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;


@Mapper(config = MapStructConfig.class)
public abstract class QuestionParamsMapper {

    @Mapping(source = "parameters.question", target = "question", qualifiedByName = "question")
    @Mapping(source = "parameters.answer", target = "answer", qualifiedByName = "question")
    @Mapping(source = "params", target = "price", qualifiedByName = "price")
    public abstract QuestionParams parametersToQuestionParams(QuestionParameters params);

    public abstract List<QuestionParams> parametersToQuestionParams(List<QuestionParameters> params);

    @Named("question")
    public List<ContentQuestion> questionTocontentQuestion(Question question) {
        if(question == null || CollectionUtils.isEmpty(question.getContentValue())) {
            return Collections.emptyList();
        }

        return Mappers.getMapper(ContentValueMapper.class).contentQuestionsToContentValue(question.getContentValue()).stream().toList();
    }

    @Named("price")
    public Price price(QuestionParameters params) {
        var typePrice = ApplyIfNotNull.chain(params.getParameters(), Parameters::getPrice, com.example.back.packStructure.Price::getType);
        NumberSet numberSet = null;
        TypePrice type = typePrice == null ? TypePrice.DEFAULT : TypePrice.of(typePrice);

        if (type != TypePrice.DEFAULT) {
            var numberSetValue = ApplyIfNotNull.chain(params.getParameters(), Parameters::getPrice, com.example.back.packStructure.Price::getNumberSetValue);
            numberSet = new NumberSet(numberSetValue.minimum, numberSetValue.maximum);
        }

        return Price
            .builder()
            .value(params.getPrice())
            .type(type)
            .numberSet(numberSet)
            .build();
    }
}
