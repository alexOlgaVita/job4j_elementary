package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.job4j.condition.Max.max;

class MaxTest {
    @Test
    void when3And5Then5() {
        int a = 3;
        int b = 5;
        int expected = 5;
        assertThat(max(a, b)).isEqualTo(expected);
    }

    @Test
    void whenMinus3AndMinus5ThenMinus3() {
        int a = -3;
        int b = -5;
        int expected = -3;
        assertThat(max(a, b)).isEqualTo(expected);
    }

    @Test
    void when3And5And6Then6() {
        int a = 3;
        int b = 5;
        int c = 6;
        int expected = 6;
        assertThat(max(a, b, c)).isEqualTo(expected);
    }

    @Test
    void when3And5And6And9Then9() {
        int a = 3;
        int b = 5;
        int c = 6;
        int d = 9;
        int expected = 9;
        assertThat(max(a, b, c, d)).isEqualTo(expected);
    }
}