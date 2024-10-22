package com.example.back.utils;

import java.util.*;
import java.util.function.Function;

public class Enums {


    /**
     * Собрать таблицу значений енума
     *
     * @param klass - класс енума
     * @param keyMapper - маппер ключей
     * @return таблица значений
     */
    public static <K, V, T extends Enum<T>> Map<K, V> valueMapOf(Class<T> klass, Function<? super T, K> keyMapper, Function<? super T, V> valMapper) {
        Map<K, V> temp = new LinkedHashMap<>();

        for (T item : klass.getEnumConstants())
            temp.put(keyMapper.apply(item), valMapper.apply(item));

        return Collections.unmodifiableMap(temp);
    }


    /**
     * Собрать таблицу значений енума
     *
     * @param klass - класс енума
     * @param keyMapper - маппер ключей
     * @return таблица значений
     */
    public static <K, T extends Enum<T>> Map<K, T> valueMapOf(Class<T> klass, Function<? super T, K> keyMapper) {
        return valueMapOf(klass, keyMapper, Function.identity());
    }



    /**
     * Собрать таблицу значений енума
     *
     * @param klass - класс енума
     * @return таблица значений
     */
    public static <T extends Enum<T>> Map<String, T> valueMapOf(Class<T> klass) {
        return valueMapOf(klass, Enum::name, Function.identity());
    }



    /**
     * Собрать набор из указанных элементов
     *
     * @param items - значения енума
     * @return неизменяемый набор элементов
     */
    @SafeVarargs
    public static <T extends Enum<T>> Set<T> valueSetOf(T ...items) {
        if (items.length == 0)
            return Collections.emptySet();

        Set<T> temp = EnumSet.noneOf(items[0].getDeclaringClass());

        for (T item : items)
            temp.add(item);

        return Collections.unmodifiableSet(temp);
    }



    /**
     * Собрать набор из указанных элементов
     *
     * @param items - значения енума
     * @return неизменяемый набор элементов
     */
    public static <T extends Enum<T>> Set<T> valueSetOf(Collection<T> items) {
        if (items.isEmpty())
            return Collections.emptySet();

        Set<T> temp = EnumSet.copyOf(items);

        return Collections.unmodifiableSet(temp);
    }



    private Enums() {}
}
