package com.example.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackApplication.class, args);
        System.out.print("33333");
        yamlToDto();
    }

    public static void yamlToDto() {

    }

}
