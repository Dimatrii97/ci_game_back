package com.example.back;

import com.example.back.packStructure.Parameters;
import com.example.back.packStructure.QuestionParameters;
import com.example.back.packStructure.Root;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AllArgsConstructor
public class PackJacksonBuildTest {

    @Test
    public void testBuild() {
        var jacksonMapper = new ObjectMapper(new YAMLFactory());
        try {
            var gg = jacksonMapper.readValue(new File("src/main/resources/tt.yaml"), Root.class);
            var c = gg.getRounds().get(0).getThemes().stream().flatMap(it -> it.getQuestions().stream()).map(QuestionParameters::getParameters)
                .map(Parameters::getQuestion).flatMap(question2 -> question2.getContentValue().stream()).toList();
           assertEquals("остров.mp3", c.get(0).getValue());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
