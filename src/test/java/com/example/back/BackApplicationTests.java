package com.example.back;

import com.example.back.packStructure.Parameters;
import com.example.back.packStructure.QuestionParameters;
import com.example.back.packStructure.Root;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.IOException;

@SpringBootTest
@AllArgsConstructor
class BackApplicationTests {

    @Test
    void contextLoads() {
//        var jacksonMapper = new ObjectMapper(new YAMLFactory());
        var v = 5;
//        try {
//            var gg = jacksonMapper.readValue(new File("src/main/resources/tt.yaml"), Root.class);
//            var c = gg.getRounds().get(0).getThemes().stream().flatMap(it -> it.getQuestions().stream()).map(QuestionParameters::getParameters)
//                .map(Parameters::getQuestion).flatMap(question2 -> question2.getContentValue().stream()).toList();
////            assertEquals("остров.mp3", d.from(c.get(0)).getValue());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

    }

}
