package com.example;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzReport {
    public String report() {
        return IntStream.range(1, 101).mapToObj(x -> String.valueOf(x)).collect(Collectors.joining("\n"));
    }
}
