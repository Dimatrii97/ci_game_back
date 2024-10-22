package com.example.back.pack.domain;

import com.example.back.utils.Enums;
import lombok.Getter;

import java.util.Map;
import java.util.function.Function;

@Getter
public enum TypePrice {
    NUMBER_SET("numberSet"),
    DEFAULT("default"),
    ;
    private final String title;


    TypePrice(String title) {
        this.title = title;
    }

    private static final Map<String, TypePrice> map =  Enums.valueMapOf(TypePrice.class, TypePrice::getTitle);

    public static TypePrice of(String title) {
        if (title == null){
            return null;
        }

        return map.get(title);
    }
}
