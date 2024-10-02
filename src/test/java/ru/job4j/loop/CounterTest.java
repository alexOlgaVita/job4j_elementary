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

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusSevenToMinusOneThenMinusTwelve() {
        int start = -7;
        int finish = -1;
        int result = Counter.sumByEven(start, finish);
        int expected = -12;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusOneToMinusSevenThenZero() {
        int start = -1;
        int finish = -7;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusEightToTwoThenMinusEighteen() {
        int start = -8;
        int finish = 2;
        int result = Counter.sumByEven(start, finish);
        int expected = -18;
        assertThat(result).isEqualTo(expected);
    }
}