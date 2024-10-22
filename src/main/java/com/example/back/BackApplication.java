package com.example.back;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.asm.TypeReference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication
@Slf4j
public class BackApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackApplication.class, args);
        var jacksonMapper = new ObjectMapper();

        try {
            InputStream inputStream = TypeReference.class.getResourceAsStream("/test.yaml");
            var gg = jacksonMapper.readValue(inputStream, TestParser.class);
            log.debug("22", gg.getId());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        System.out.print("33333");
        yamlToDto();
    }

    public static void yamlToDto() {

    }

}
