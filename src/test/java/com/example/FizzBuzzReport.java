package com.example;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzReport {
    public String report() {
        return IntStream.range(1, 101).mapToObj(this::lineForTurn).collect(Collectors.joining("\n"));
    }

    private String lineForTurn(int turn) {
        if (isFizz(turn) && isBuzz(turn)) return "FizzBuzz";
        if (isFizz(turn)) return "Fizz";
        if (isBuzz(turn)) return "Buzz";
        return String.valueOf(turn);
    }

    private boolean isBuzz(int turn) {
        return isDividableBy(turn, 5);
    }

    private boolean isFizz(int turn) {
        return isDividableBy(turn, 3);
    }

    private boolean isDividableBy(int turn, int i) {
        return turn % i == 0;
    }
}
