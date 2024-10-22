package com.example.back.pack.domain;

import com.example.back.utils.Enums;
import lombok.Getter;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

@Getter
public enum ContentType {
    IMAGE("image"),
    VIDEO("video"),
    TEXT("text"),
    SELECT("select"),
    FLASH("flash"),
    CUSTOM("custom"),
    ;

    private final String title;

    ContentType(String title) {
        this.title = title;
    }

    private static final Map<String, ContentType> map =  Enums.valueMapOf(ContentType.class, ContentType::getTitle);

    public static ContentType of(String title) {
        if (title == null){
            return null;
        }

        return map.get(title);
    }
}
