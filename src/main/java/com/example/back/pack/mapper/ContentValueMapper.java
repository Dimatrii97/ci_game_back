package com.example.back.pack.mapper;

import com.example.back.configs.mapper.MapStructConfig;
import com.example.back.pack.domain.ContentQuestion;
import com.example.back.pack.domain.ContentType;
import com.example.back.packStructure.ContentValue;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.Collection;
import java.util.List;

@Mapper(config = MapStructConfig.class)
public abstract class ContentValueMapper {

    @Mapping(source = "type", target = "type", qualifiedByName = "type")
    public abstract ContentQuestion contentQuestionToContentValue(ContentValue contentValue);

    public abstract Collection<ContentQuestion> contentQuestionsToContentValue(Collection<ContentValue> contentValue);

    @Named("type")
    public ContentType mapQuestion(String type) {
        if (type == null) {
            return null;
        }

        return ContentType.of(type);
    }
}
