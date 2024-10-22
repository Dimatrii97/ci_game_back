package com.example.back.utils;

import java.util.function.Function;

public class ApplyIfNotNull {
    public static <R, T> T of (R o, Function<R, T> function) {
        if (o == null) {
            return null;
        }

        return function.apply(o);
    }

    public static <S, R1, R2> R2 chain(S o, Function<S, R1> function, Function<R1, R2> function2) {
        if (o == null) {
            return null;
        }

        return of(function.apply(o), function2);
    }

    public static <S, R1, R2, R3> R3 chain(S o, Function<S, R1> function, Function<R1, R2> function2, Function<R2, R3> function3) {
        if (o == null) {
            return null;
        }

        R2 r2 = of(function.apply(o), function2);

        return of(r2, function3);
    }
}
