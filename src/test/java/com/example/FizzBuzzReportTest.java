package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzReportTest {
    @Test
    void should_report_100_items() {
        assertThat(getReportLines().length).isEqualTo(100);
    }

    @Test
    void should_report_fizz_for_turn_3() {
        assertThat(getReportLines()[3 - 1]).isEqualTo("Fizz");
    }

    @Test
    void should_report_buzz_for_turn_5() {
        assertThat(getReportLines()[5 - 1]).isEqualTo("Buzz");
    }

    private String[] getReportLines() {
        return new FizzBuzzReport().report().split("\n");
    }
}
