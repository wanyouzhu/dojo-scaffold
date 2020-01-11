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
        assertThat(getReportLine(3)).isEqualTo("Fizz");
    }

    @Test
    void should_report_buzz_for_turn_5() {
        assertThat(getReportLine(5)).isEqualTo("Buzz");
    }

    @Test
    void should_report_fizz_buzz_for_turn_15() {
        assertThat(getReportLine(15)).isEqualTo("FizzBuzz");
    }

    @Test
    void should_report_fizz_for_turn_whose_number_contains_3() {
        assertThat(getReportLine(13)).isEqualTo("Fizz");
    }

    @Test
    void should_report_buzz_for_turn_whose_number_contains_5() {
        assertThat(getReportLine(58)).isEqualTo("Buzz");
    }

    private String[] getReportLines() {
        return new FizzBuzzReport().report().split("\n");
    }

    private String getReportLine(int lineNumber) {
        return getReportLines()[lineNumber - 1];
    }
}
