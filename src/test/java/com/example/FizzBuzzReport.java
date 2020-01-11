package com.example;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzReport {
    public String report() {
        return IntStream.range(1, 101).mapToObj(this::lineForTurn).collect(Collectors.joining("\n"));
    }

    private String lineForTurn(int turn) {
        if (isDividableBy(turn, 3) && isDividableBy(turn, 5)) return "FizzBuzz";
        if (isDividableBy(turn, 3)) return "Fizz";
        if (isDividableBy(turn, 5)) return "Buzz";
        return String.valueOf(turn);
    }

    private boolean isDividableBy(int turn, int i) {
        return turn % i == 0;
    }
}
