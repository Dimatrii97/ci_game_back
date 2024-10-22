package com.example.back.pack.mapper;

import com.example.back.pack.domain.ContentType;
import com.example.back.packStructure.ContentValue;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
@AllArgsConstructor
class ContentValueMapperTest {

    @Test
    void contentValue_to_ContentQuestion() {
        var cv = new ContentValue();
        cv.setValue("Пять");
        cv.setType("video");
        var cq = Mappers.getMapper(ContentValueMapper.class).contentQuestionToContentValue(cv);

        assertEquals("Пять", cq.getValue());
        assertEquals(ContentType.VIDEO, cq.getType());
    }

}