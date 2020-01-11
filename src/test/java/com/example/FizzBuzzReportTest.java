package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzReportTest {
    @Test
    void should_report_100_items() {
        assertThat(new FizzBuzzReport().report().split("\n").length).isEqualTo(100);
    }

    @Test
    void should_report_fizz_for_turn_3() {
        assertThat(new FizzBuzzReport().report().split("\n")[3 - 1]).isEqualTo("Fizz");
    }
}
