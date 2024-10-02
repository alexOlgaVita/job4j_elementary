package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenFrom0To3Then6() {
        int expected = 6;
        int output = Counter.sum(0, 3);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenFrom9To99Then4914() {
        int expected = 4914;
        int output = Counter.sum(9, 99);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenFrom77To55Then0() {
        int expected = 0;
        int output = Counter.sum(77, 55);
        assertThat(output).isEqualTo(expected);
    }
}