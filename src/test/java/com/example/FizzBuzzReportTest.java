package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzReportTest {
    @Test
    void should_report_100_items() {
        assertThat(new FizzBuzzReport().report().split("\n").length).isEqualTo(100);
    }
}
