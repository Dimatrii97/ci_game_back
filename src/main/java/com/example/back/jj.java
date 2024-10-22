package com.example.back;


import com.example.back.pack.mapper.ContentValueMapper;
import com.example.back.pack.mapper.QuestionParamsMapper;
import com.example.back.packStructure.Root;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

@Slf4j
@RequiredArgsConstructor
@Service
public class jj {

     public static void main(String[] args) {
//          ObjectMapper jacksonMapper = new ObjectMapper(new YAMLFactory());
//
//         try {
//             InputStream inputStream = TypeReference.class.getResourceAsStream("/test.yaml");
//             var gg = jacksonMapper.readValue(new File("src/main/resources/tt.yaml"), Root.class);
//             var c = gg.getRounds().get(0).getThemes().stream().flatMap(it -> it.getQuestions().stream())
//             Mappers.getMapper(QuestionParamsMapper.class);
//             System.out.print("44 " + d.from(c.get(0)).getValue());
//         } catch (IOException e) {
//             throw new RuntimeException(e);
//         }
    }


}
